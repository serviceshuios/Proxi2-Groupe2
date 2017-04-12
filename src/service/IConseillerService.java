package service;

import java.sql.SQLException;
import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.ClientGererParAutreConseillerException;
import service.exceptions.ClientInexistantException;
import service.exceptions.ClientPossedeDejaConseillerException;
import service.exceptions.MontantNegatifException;
import service.exceptions.NombreClientsMaxAtteintException;
import service.exceptions.SoldeInsuffisantException;

public interface IConseillerService {

	public Conseiller authentificationConseiller(String login, String mdp) throws ClassNotFoundException;

	public Collection<Client> listerClients(Conseiller cons) throws ClassNotFoundException;

	public Collection<Compte> listerComptes(Client cl);

	void effectuerVirement(Conseiller conseiller, Compte compteEmetteur, Compte compteRecepteur, double montant)
			throws SoldeInsuffisantException, MontantNegatifException, SQLException,
			ClientGererParAutreConseillerException;

	void ajouterClient(Conseiller conseiller, Client client, String nom, String prenom, String adresse,
			String telephone, String ville, String email, String codepostal)
			throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException;

	void supprimerClient(Conseiller conseiller, Client client, int id)
			throws ClientGererParAutreConseillerException, ClientInexistantException, SQLException;

	void modifierClient(int idClient, String prenom, String nom, String ville, String adresse, String codepostal,
			String email, String telephone);
}
