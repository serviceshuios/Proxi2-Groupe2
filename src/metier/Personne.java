package metier;

/**
 * Classe abstraite représentant les personnes
 * 
 * @author Perrine EMIN et Guillaume OTHMANE
 *
 */
public abstract class Personne {

	private int id;
	private String nom;
	private String prenom;
	private Coordonnees coordonnees;
	private static final String USER = null;
	private static final String MDP = null;

	/**
	 * Getter de l'attribut id
	 * 
	 * @return the id Id de la personne
	 */
	public int getId() {
		return id;
	}

	/**
	 * Seter de l'attribut id
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Geter de l'attribut nom
	 * 
	 * @return the nom nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Seter de l'attribut nom
	 * 
	 * @param nom
	 *            the nom to set nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter de l'attribut prenom
	 * 
	 * @return the prenom prenom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter de l'attribut prenom
	 * 
	 * @param prenom
	 *            the prenom to set prenom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter de l'attribut coordonnees
	 * 
	 * @return the coordonnees coordonnées de la personne
	 */
	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	/**
	 * @param coordonnees
	 *            the coordonnees to set
	 */
	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	/**
	 * @return the user
	 */
	public static String getUser() {
		return USER;
	}

	/**
	 * @return the mdp
	 */
	public static String getMdp() {
		return MDP;
	}

	/**
	 * Constructeur de Personne sans argument
	 */
	public Personne() {
		super();
	}

}
