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
	public Collection<Client> listerClients(Conseiller cons)
			throws ClassNotFoundException {
		return idao.listerClients(cons);}
	
	@Override
	public void effectuerVirement(Conseiller conseiller, Compte compteEmetteur, Compte compteRecepteur, double montant)
			throws SoldeInsuffisantException, MontantNegatifException, SQLException,
			ClientGererParAutreConseillerException {
		if (!conseiller.getClients().contains(compteEmetteur)) {
			throw new ClientGererParAutreConseillerException("Ce conseiller ne g�re pas ce client");
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
			throw new MontantNegatifException("Montant n�gatif");
		}

		idao.retraitSolde(compteEmetteur, montant);
		idao.ajoutSolde(compteRecepteur, montant);
	}

	@Override
	public Collection<Compte> listerComptes(Client cl){
		return idao.listerComptes(cl);
	}

	@Override
	public void modifierClient(int idClient, String prenom, String nom, String ville, String adresse, String codepostal,String email, String telephone) {
		idao.modifierClient(idClient, prenom,  nom,  ville,  adresse,  codepostal, email, telephone);

	}

	@Override
	public void ajouterClient(Conseiller conseiller, Client client, String nom, String prenom, String adresse, String telephone, String ville, String email, String codepostal)
			throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException {
		if (client.getConseiller() == null) {
			if (conseiller.getClients().size() < 10) {
				idao.ajouterClient(conseiller, client, nom, prenom, adresse, telephone, ville, email, codepostal);
			} else {
				throw new NombreClientsMaxAtteintException("Le conseiller a d�j� 10 clients");
			}
		} else {
			throw new ClientPossedeDejaConseillerException("Le client poss�de d�j� un conseiller");
		}
	}

	@Override
	public void supprimerClient(Conseiller conseiller, Client client, int id) throws ClientGererParAutreConseillerException, ClientInexistantException, SQLException {
		if (!conseiller.getClients().contains(client)) {
			throw new ClientGererParAutreConseillerException("Ce conseiller ne g�re pas ce client");
		}
		idao.supprimerClient(client, id);
	}

}
