/**
 * 
 */
package metier;

/**
 * Classe pour la gestion des adresses et des numeros de telephone. Les
 * proprietes adresse, ville, cp (pour code postal) et telephone sont des
 * varaibles String qui sont cachees a l'exterieur de la classe. Il existe un
 * seul constructeurs qui prend en parametre l'adresse, la ville, le code
 * postal, et le numero de telephone, tous en String. Pour chaque propriete il
 * existe des methodes getter et setter. Il existe egalement une methode
 * toString() pour l'affichage d'une date.
 * 
 * @author Konrad THOMAS et VIncent PANOUILLERES
 */

public class Coordonnees {

	// Proprietes
	private String adresse;
	private String ville;
	private String cp;
	private String telephone;
	private String email;

	/**
	 * Contructeur de la classe coordonnées
	 * 
	 * @param adresse
	 *            Detail de l'adresse
	 * @param ville
	 *            Ville
	 * @param cp
	 *            Code postal associe a la ville
	 * @param telephone
	 *            Telephone
	 */
	public Coordonnees(String adresse, String ville, String cp, String telephone) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.telephone = telephone;
	}

	/**
	 * Getter de l'adresse
	 * 
	 * @return Adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter de l'adresse
	 * 
	 * @param adresse
	 *            Adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter de la ville
	 * 
	 * @return Ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter de la ville
	 * 
	 * @param ville
	 *            Ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Getter du code postal
	 * 
	 * @return Code postal
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * Setter du code postal
	 * 
	 * @param cp
	 *            Code postal
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * Getter du numéro de téléphone
	 * 
	 * @return Numéro de téléphone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Setter du numéro de téléphone
	 * 
	 * @param telephone
	 *            Numéro de téléphone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * Getter de l'email
	 * 
	 * @return Email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter de l'email
	 * @param email Email du client
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	// Methode toString()
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coordonees: " + adresse + ", " + cp + " " + ville + "; tel: " + telephone;
	}
}
