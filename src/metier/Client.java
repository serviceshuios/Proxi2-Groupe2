package metier;

/**
 * Classe représentant les clients de la banque, héritant de la classe Personne
 * @author Jérome IZARD et Perrine EMIN
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

	public void setEntreprise(boolean entreprise) {
		this.entreprise = entreprise;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
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
