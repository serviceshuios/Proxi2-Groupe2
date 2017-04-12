package metier;

/**
 * Cette classe comprend l'ensemble des donnes relative a un placement.
 * 
 * @author Perrine EMIN et Guillaume OTHMANE
 *
 */
public class Placement {

	// Proprietes
	private Client client;
	private double montant;
	private String placeFinanciere;

	// Constructeur
	/**
	 * @param client
	 *            Le client associe au placement
	 * @param montant
	 *            Le montant du placement
	 * @param placeFinanciere
	 *            La place financiere pour laquelle on a fait le placement.
	 */
	public Placement(Client client, double montant, String placeFinanciere) {
		super();
		this.client = client;
		this.montant = montant;
		this.placeFinanciere = placeFinanciere;
	}

	// Getters et Setters
	/**
	 * Getter de l'attribut client
	 * 
	 * @return the client client qui effectue le placement
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Setter de l'attribut client
	 * 
	 * @param client
	 *            the client to set client qui effectue le placement
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter de l'attribut montant
	 * 
	 * @return the montant montant du placement
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Setter de l'attribut montant
	 * 
	 * @param montant
	 *            the montant to set montant du placement
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * Getter de l'attribut placeFinanciere
	 * 
	 * @return the placeFinancier place financi�re du placement
	 */
	public String getPlaceFinanciere() {
		return placeFinanciere;
	}

	/**
	 * Setter de l'attribut placeFinanciere
	 * 
	 * @param placeFinanciere
	 *            the placeFinancier to set place financi�re du placement
	 */
	public void setPlaceFinanciere(String placeFinanciere) {
		this.placeFinanciere = placeFinanciere;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return montant + " Euros ont �t� investis � " + placeFinanciere + " pour " + client + ".";
	}
}
