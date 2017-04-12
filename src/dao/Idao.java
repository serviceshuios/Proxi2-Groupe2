package dao;

import java.sql.SQLException;
import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.ClientInexistantException;

public interface Idao {

	/**
	 * M�thode permettant de retrouver un conseiller par son login et son mot de passe
	 * 
	 * @return Le conseiller s'il existe
	 * @throws ClassNotFoundException
	 */
	public Conseiller authentificationConseiller(String login, String mdp) throws ClassNotFoundException;
	
	
	/**
	 * M�thode permettant � un conseiller de lister ses clients
	 * 
	 * @return La liste des informations client pour les clients du conseiller
	 *         authentifi�
	 * @throws ClassNotFoundException
	 */
	public Collection<Client> listerClients() throws ClassNotFoundException;

	/**
	 * M�thode permettant � un conseiller d'afficher la liste des comptes de ses
	 * clients
	 * 
	 * @return La liste des comptes des clients du conseiller authentifi�
	 */
	public Collection<Compte> listerComptes();

	/**
	 * M�thode permettant d'augmenter le solde d'un compte
	 * 
	 * @param c
	 *            Compte dont le solde est modifi� suite � un virement
	 * @param montant
	 *            Montant du virement � effectuer
	 * @throws SQLException
	 */
	void ajoutSolde(Compte c, double montant) throws SQLException;

	/**
	 * M�thode permettant de diminuer le solde d'un compte
	 * 
	 * @param c
	 *            Compte dont le solde est modifi� suite � un virement
	 * @param montant
	 *            Montant du virement � effectuer
	 * @throws SQLException
	 */
	void retraitSolde(Compte c, double montant) throws SQLException;

	/**
	 * 
	 * M�thode permettant de modifier les informations d'un client
	 * 
	 * @param idClient
	 *            Num�ro unique d'identification client
	 * @param prenom
	 *            Nouveau pr�nom du client � modifier
	 * @param nom
	 *            Nouveau nom du client � modifier
	 * @param ville
	 *            Nouvelle ville du client � modifier
	 * @param rue
	 *            Nouvelle rue du client � modifier
	 * @param codepostal
	 *            Nouveau code postal du client � modifier
	 * @param email
	 *            Nouvel email du client � modifier
	 */
	void modifierClient(int idClient, String prenom, String nom, String ville, String adresse, String codepostal,
			String email);

	void ajouterClient(Conseiller conseiller, Client client, String nom, String prenom, String adresse,
			String telephone, String ville, String email, String codepostal) throws SQLException;

	void supprimerClient(Client client, int id) throws ClientInexistantException, SQLException;
}
