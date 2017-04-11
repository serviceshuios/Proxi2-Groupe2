package service;

import java.sql.SQLException;
import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public interface IConseillerService {
	
	public Collection<Client> listerClients(Conseiller cons, Client c) throws ClassNotFoundException;
	public void effectuerVirement(Compte compteEmetteur, Compte compteRecepteur, double montant) throws SoldeInsuffisantException, MontantNegatifException, SQLException;
	public Collection<Compte> listerComptes(Conseiller cons, Client c);
	void modifierClient(int idClient, String prenom, String nom, String ville, String rue, String codepostal,
			String email);

}
