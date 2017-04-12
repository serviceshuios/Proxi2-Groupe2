package metier;

/**
 * Classe représentant le gérant d'une agence. Hérite de la classe Personne
 * 
 * @author Jérome IZARD et Perrine EMIN
 *
 */
public class Gerant extends Personne {

	private Agence agence;

	/**
	 * Getter de l'attribut agence
	 * 
	 * @return agence du gérant
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * Setter de l'attribut agence
	 * 
	 * @param agence
	 *            agence du gérant
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public void auditerAgence() {

	}

	@Override
	public String toString() {
		return "Gerant [getNom()=" + getNom() + "]";
	}

}
