package metier;

import java.util.Date;

/**
 * Classe abstraite représentant les comptes des clients de la banque
 * @author Jérome IZARD et Perrine EMIN
 *
 */
public abstract class Compte {

	private long id;
	private long numCompte;
	private double solde;
	private Date dateOuverture;
	private Client client;

	private Carte carte;

	/**
	 * Getter de l'identifiant du compte
	 * @return Identifiant du compte
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter de l'identifiant du compte
	 * @param id Identifiant du compte
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter du numéro de compte
	 * @return Numéro de compte
	 */
	public long getNumCompte() {
		return numCompte;
	}

	/**
	 * Setter du numéro de compte
	 * @param numCompte Numéro de compte
	 */
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * Getter du solde du compte
	 * @return Solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter du solde du compte
	 * @param solde Solde du compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter de la date d'ouverture du compte
	 * @return Date d'ouverture du compte
	 */
	public Date getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * Setter de la date d'ouverture du compte
	 * @param dateOuverture Date d'ouverture du compte
	 */
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	/**
	 * Getter du client du compte
	 * @return Client du compte
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Setter du client du compte
	 * @param client Client du compte
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter de la carte du compte
	 * @return Carte du compte
	 */
	public Carte getCarte() {
		return carte;
	}

	/**
	 * Setter de la carte du compte
	 * @param carte Carte du compte
	 */
	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", solde=" + solde + ", dateOuverture=" + dateOuverture + ", carte=" + carte + "]";
	}

}
