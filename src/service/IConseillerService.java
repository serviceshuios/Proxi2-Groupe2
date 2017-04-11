package service;

import java.sql.SQLException;
import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.ClientGererParAutreConseillerException;
import service.exceptions.ClientPossedeDejaConseillerException;
import service.exceptions.MontantNegatifException;
import service.exceptions.NombreClientsMaxAtteintException;
import service.exceptions.SoldeInsuffisantException;

public interface IConseillerService {
	
	public Collection<Client> listerClients(Conseiller cons, Client c) throws ClassNotFoundException, ClientGererParAutreConseillerException;
	public Collection<Compte> listerComptes(Conseiller cons, Client c) throws ClientGererParAutreConseillerException;
	void effectuerVirement(Conseiller conseiller, Compte compteEmetteur, Compte compteRecepteur, double montant)
			throws SoldeInsuffisantException, MontantNegatifException, SQLException,
			ClientGererParAutreConseillerException;
	void modifierClient(Conseiller conseiller, Client client) throws ClientGererParAutreConseillerException;
	void ajouterClient(Conseiller conseiller, Client client) throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException;
	void supprimerClient(Conseiller conseiller, Client client) throws ClientGererParAutreConseillerException;
}
