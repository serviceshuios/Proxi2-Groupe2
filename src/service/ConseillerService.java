package service;

import java.sql.SQLException;
import java.util.Collection;

import dao.DAO;
import dao.Idao;
import metier.Client;
import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;
import metier.Conseiller;
import service.exceptions.ClientGererParAutreConseillerException;
import service.exceptions.ClientInexistantException;
import service.exceptions.ClientPossedeDejaConseillerException;
import service.exceptions.MontantNegatifException;
import service.exceptions.NombreClientsMaxAtteintException;
import service.exceptions.SoldeInsuffisantException;

public class ConseillerService implements IConseillerService {

	private Idao idao = new DAO();

	@Override
	public Conseiller authentificationConseiller(String login, String mdp) throws ClassNotFoundException {
		return idao.authentificationConseiller(login, mdp);
	}
	
	@Override
	public Collection<Client> listerClients(Conseiller conseiller){
			
		return idao.listerClients();

	}

	@Override
	public void effectuerVirement(Conseiller conseiller, Compte compteEmetteur, Compte compteRecepteur, double montant)
			throws SoldeInsuffisantException, MontantNegatifException, SQLException,
			ClientGererParAutreConseillerException {
		if (!conseiller.getClients().contains(compteEmetteur)) {
			throw new ClientGererParAutreConseillerException("Ce conseiller ne gère pas ce client");
		}
		if (montant >= 0) {
			if (compteEmetteur instanceof CompteEpargne) {
				if (montant > compteEmetteur.getSolde()) {
					throw new SoldeInsuffisantException("Solde insuffisant");
				}

			}

			if (compteEmetteur instanceof CompteCourant) {
				double decouvert = ((CompteCourant) compteEmetteur).getDecouvert();
				if (montant > compteEmetteur.getSolde() + decouvert) {
					throw new SoldeInsuffisantException("Solde insuffisant");
				}
			}
		} else {
			throw new MontantNegatifException("Montant négatif");
		}

		idao.retraitSolde(compteEmetteur, montant);
		idao.ajoutSolde(compteRecepteur, montant);
	}

	@Override
	public Collection<Compte> listerComptes(Conseiller cons, Client c) throws ClientGererParAutreConseillerException {
		if (!cons.getClients().contains(c)) {
			throw new ClientGererParAutreConseillerException("Ce conseiller ne gère pas ce client");
		}
		return idao.listerComptes();
	}

	@Override
	public void modifierClient(Conseiller conseiller, Client client) throws ClientGererParAutreConseillerException {
		if (!conseiller.getClients().contains(client)) {
			throw new ClientGererParAutreConseillerException("Ce conseiller ne gère pas ce client");
		}
		idao.modifierClient(client.getId(), client.getPrenom(), client.getNom(), client.getCoordonnees().getAdresse(),
				client.getCoordonnees().getCp(), client.getCoordonnees().getVille(),
				client.getCoordonnees().getEmail());

	}

	@Override
	public void ajouterClient(Conseiller conseiller, Client client, String nom, String prenom, String adresse, String telephone, String ville, String email, String codepostal)
			throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException {
		if (client.getConseiller() == null) {
			if (conseiller.getClients().size() < 10) {
				idao.ajouterClient(conseiller, client, nom, prenom, adresse, telephone, ville, email, codepostal);
			} else {
				throw new NombreClientsMaxAtteintException("Le conseiller a déjà 10 clients");
			}
		} else {
			throw new ClientPossedeDejaConseillerException("Le client possède déjà un conseiller");
		}
	}

	@Override
	public void supprimerClient(Conseiller conseiller, Client client, int id) throws ClientGererParAutreConseillerException, ClientInexistantException, SQLException {
		if (!conseiller.getClients().contains(client)) {
			throw new ClientGererParAutreConseillerException("Ce conseiller ne gère pas ce client");
		}
		idao.supprimerClient(client, id);
	}

}
