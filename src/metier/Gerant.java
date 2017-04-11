package metier;

/**
 * Classe repr�sentant le g�rant d'une agence. H�rite de la classe Personne
 * @author J�rome IZARD et Perrine EMIN
 *
 */
public class Gerant extends Personne {

	private Agence agence;

	public Agence getAgence() {
		return agence;
	}

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
