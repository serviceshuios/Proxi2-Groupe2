package service;

import java.sql.SQLException;
import java.util.Collection;

import dao.DAO;
import metier.Client;
import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;
import metier.Conseiller;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class ConseillerService implements IConseillerService {
	
	private dao.Idao idao = new DAO();

	@Override
	public Collection<Client> listerClients(Conseiller conseiller, Client c) throws ClassNotFoundException {
		return idao.listerClients();

	}

	@Override
	public void effectuerVirement(Compte compteEmetteur, Compte compteRecepteur, double montant)
			throws SoldeInsuffisantException, MontantNegatifException, SQLException {
		
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
	public Collection<Compte> listerComptes(Conseiller cons, Client c) {
		return idao.listerComptes();
	}

	@Override
	public void modifierClient(int idClient, String prenom, String nom, String ville, String rue, String codepostal,
			String email) {
		idao.modifierClient(idClient, prenom, nom, ville, rue, codepostal, email);
		
	}

}
