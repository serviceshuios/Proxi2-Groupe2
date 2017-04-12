package metier;

/**
 * Classe représentant un type spécifique de compte, les comptes courants
 * @author Perrine EMIN et Guillaume OTHMANE
 *
 */
public class CompteCourant extends Compte {

	private double decouvert = 1000;

	/**
	 * Getter du découvert du compte courant
	 * @return Découvert du compte courant
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter du découvert du compte courant
	 * @param decouvert Découvert du compte courant
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


	@Override
	public String toString() {
		return "CompteCourant [getId()=" + getId() + ", getSolde()=" + getSolde() + "]";
	}

	

	

}
