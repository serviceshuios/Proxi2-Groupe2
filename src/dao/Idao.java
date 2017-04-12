package dao;

import java.sql.SQLException;
import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.ClientInexistantException;

public interface Idao {

	/**
	 * M�thode permettant de retrouver un conseiller par son login et son mot de
	 * passe
	 * 
	 * @return Le conseiller s'il existe
	 * @throws ClassNotFoundException
	 *             Exception si le conseiller n'existe pas
	 * @param login login du conseiller
	 * @param mdp mot de passe du conseiller
	 * 
	 */
	public Conseiller authentificationConseiller(String login, String mdp) throws ClassNotFoundException;

	/**
	 *  M�thode permettant � un conseiller de lister ses clients
	 * 
	 * @return La liste des informations client pour les clients du conseiller
	 *         authentifi�
	 * @throws ClassNotFoundException Exception si la classe de client concern� n'existe pas
	 *
	 * @param cons Conseiller d�finit par l'authentification
	 * 
	 */
	public Collection<Client> listerClients(Conseiller cons) throws ClassNotFoundException;

	/**
	 * M�thode permettant � un conseiller d'afficher la liste des comptes de ses
	 * clients
	 * 
	 * @return La liste des comptes des clients du conseiller authentifi�
	 * @param cl Le client dont on veut afficher les comptes
	 * 
	 */
	public Collection<Compte> listerComptes(Client cl);

	/**
	 * M�thode permettant d'augmenter le solde d'un compte
	 * 
	 * @param c
	 *            Compte dont le solde est modifi� suite � un virement
	 * @param montant
	 *            Montant du virement � effectuer
	 * @throws SQLException Erreur due � la comlmlunication avec la base de donn�es
	 */
	void ajoutSolde(Compte c, double montant) throws SQLException;

	/**
	 * M�thode permettant de diminuer le solde d'un compte
	 * 
	 * @param c
	 *            Compte dont le solde est modifi� suite � un virement
	 * @param montant
	 *            Montant du virement � effectuer
	 * @throws SQLException Erreur due � la comlmlunication avec la base de donn�es
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
	 * @param adresse
	 *            Nouvelle rue du client � modifier
	 * @param codepostal
	 *            Nouveau code postal du client � modifier
	 * @param email
	 *            Nouvel email du client � modifier
	 * @param telephone Nouveau num�ro de t�l�phone du client � modifier
	 */
	void modifierClient(int idClient, String prenom, String nom, String ville, String adresse, String codepostal,
			String email, String telephone);

	void ajouterClient(Conseiller conseiller, Client client, String nom, String prenom, String adresse,
			String telephone, String ville, String email, String codepostal) throws SQLException;

	void supprimerClient(Client client, int id) throws ClientInexistantException, SQLException;
}
