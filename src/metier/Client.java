package metier;

/**
 * Classe représentant les clients de la banque, héritant de la classe Personne
 * 
 * @author Perrine EMIN et Guillaume OTHMANE
 *
 */
public class Client extends Personne {

	private boolean entreprise;
	private Conseiller conseiller;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	private Placement placement;

	public boolean isEntreprise() {
		return entreprise;
	}

	/**
	 * Getter de l'attribut conseiller
	 * 
	 * @return the conseiller
	 */
	public Conseiller getConseiller() {
		return conseiller;
	}

	/**
	 * Setter de l'attribut conseiller
	 * 
	 * @param conseiller
	 *            the conseiller to set
	 */
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	/**
	 * Getter de l'attribut compteCourant
	 * 
	 * @return the compteCourant
	 */
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	/**
	 * Setter de l'attribut compteCourant
	 * 
	 * @param compteCourant
	 *            the compteCourant to set
	 */
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	/**
	 * Getter de l'attribut compteEpargne
	 * 
	 * @return the compteEpargne
	 */
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	/**
	 * Setter de l'attribut compteEpargne
	 * 
	 * @param compteEpargne
	 *            the compteEpargne to set
	 */
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	/**
	 * Getter de l'attribut placement
	 * 
	 * @return the placement
	 */
	public Placement getPlacement() {
		return placement;
	}

	/**
	 * Setter de l'attribut placement
	 * 
	 * @param placement
	 *            the placement to set
	 */
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	/**
	 * Setter de l'attribut entreprise
	 * 
	 * @param entreprise
	 *            the entreprise to set
	 */
	public void setEntreprise(boolean entreprise) {
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {
		if (isEntreprise()) {
			return "Client [entreprise=" + entreprise + ", conseiller=" + conseiller + ", compteCourant="
					+ compteCourant + ", compteEpargne=" + compteEpargne + ", getNom()=" + getNom() + "]";
		}
		return "Client [entreprise=" + entreprise + ", conseiller=" + conseiller + ", compteCourant=" + compteCourant
				+ ", compteEpargne=" + compteEpargne + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + "]";
	}

}
