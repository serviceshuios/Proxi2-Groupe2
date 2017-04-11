package metier;

import java.util.Date;

/**
 * Classe abstraite repr�sentant les cartes bancaires propos�es aux clients
 * @author J�rome IZARD et Perrine EMIN
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
	 * Getter du compte associ� � la carte
	 * @return Comte associ� � la carte
	 */
	public Compte getCompte() {
		return compte;
	}
	/**
	 * Setter du compte associ� � la carte
	 * @param compte Comtpe associ� � la carte
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	/**
	 * Getter du num�ro de la carte
	 * @return Num�ro de la carte
	 */
	public String getNumeroCarte() {
		return numeroCarte;
	}
	/**
	 * Setter du num�ro de la carte
	 * @param numeroCarte Num�ro de la carte
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
