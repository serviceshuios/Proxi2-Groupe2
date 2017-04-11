package metier;

/**
 * Classe abstraite représentant les personnes
 * @author Jérome IZARD et Perrine EMIN
 *
 */
public abstract class Personne {

	private int id;
	private String nom;
	private String prenom;
	private Coordonnees coordonnees;
	private static final String USER=null;
	private static final String MDP=null;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * Constructeur de Personne sans argument
	 */
	public Personne() {
		super();
	}



}
