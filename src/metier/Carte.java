package metier;

import java.util.Date;

/**
 * Classe abstraite représentant les cartes bancaires proposées aux clients
 * @author Jérome IZARD et Perrine EMIN
 *
 */
public abstract class Carte {

	private int id;
	private Compte compte;
	private String numeroCarte;
	private Date dateExpiration;
	
	/**
	 * Getter de l'identifiant de la carte
	 * @return Identifiant de la carte
	 */
	public int getId() {
		return id;
	}
	/**
	 * Setter de l'identifiant de la carte
	 * @param id Identifiant de la carte
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Getter du compte associé à la carte
	 * @return Comte associé à la carte
	 */
	public Compte getCompte() {
		return compte;
	}
	/**
	 * Setter du compte associé à la carte
	 * @param compte Comtpe associé à la carte
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	/**
	 * Getter du numéro de la carte
	 * @return Numéro de la carte
	 */
	public String getNumeroCarte() {
		return numeroCarte;
	}
	/**
	 * Setter du numéro de la carte
	 * @param numeroCarte Numéro de la carte
	 */
	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	/**
	 * Getter de la date d'expiration de la carte
	 * @return Date d'expiration
	 */
	public Date getDateExpiration() {
		return dateExpiration;
	}
	/**
	 * Setter de la date d'expiration de la carte
	 * @param dateExpiration Date d'expiration de la carte
	 */
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	

}
