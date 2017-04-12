package dao;

import java.sql.SQLException;
import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.ClientInexistantException;

public interface Idao {

	/**
	 * Méthode permettant de retrouver un conseiller par son login et son mot de passe
	 * 
	 * @return Le conseiller s'il existe
	 * @throws ClassNotFoundException
	 */
	public Conseiller authentificationConseiller(String login, String mdp) throws ClassNotFoundException;
	
	
	/**
	 * Méthode permettant à un conseiller de lister ses clients
	 * 
	 * @return La liste des informations client pour les clients du conseiller
	 *         authentifié
	 * @throws ClassNotFoundException
	 */
	public Collection<Client> listerClients() throws ClassNotFoundException;

	/**
	 * Méthode permettant à un conseiller d'afficher la liste des comptes de ses
	 * clients
	 * 
	 * @return La liste des comptes des clients du conseiller authentifié
	 */
	public Collection<Compte> listerComptes();

	/**
	 * Méthode permettant d'augmenter le solde d'un compte
	 * 
	 * @param c
	 *            Compte dont le solde est modifié suite à un virement
	 * @param montant
	 *            Montant du virement à effectuer
	 * @throws SQLException
	 */
	void ajoutSolde(Compte c, double montant) throws SQLException;

	/**
	 * Méthode permettant de diminuer le solde d'un compte
	 * 
	 * @param c
	 *            Compte dont le solde est modifié suite à un virement
	 * @param montant
	 *            Montant du virement à effectuer
	 * @throws SQLException
	 */
	void retraitSolde(Compte c, double montant) throws SQLException;

	/**
	 * 
	 * Méthode permettant de modifier les informations d'un client
	 * 
	 * @param idClient
	 *            Numéro unique d'identification client
	 * @param prenom
	 *            Nouveau prénom du client à modifier
	 * @param nom
	 *            Nouveau nom du client à modifier
	 * @param ville
	 *            Nouvelle ville du client à modifier
	 * @param rue
	 *            Nouvelle rue du client à modifier
	 * @param codepostal
	 *            Nouveau code postal du client à modifier
	 * @param email
	 *            Nouvel email du client à modifier
	 */
	void modifierClient(int idClient, String prenom, String nom, String ville, String adresse, String codepostal,
			String email);

	void ajouterClient(Conseiller conseiller, Client client, String nom, String prenom, String adresse,
			String telephone, String ville, String email, String codepostal) throws SQLException;

	void supprimerClient(Client client, int id) throws ClientInexistantException, SQLException;
}
