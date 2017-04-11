package metier;

/**
 * Classe représentant un type spécifique de compte, les comptes épargne
 * @author Jérome IZARD et Perrine EMIN
 *
 */
public class CompteEpargne extends Compte {

	private double tauxRemuneration = 0.03;

	/**
	 * Getter du taux de rémunération du compte épargne
	 * @return Taux de rémunération du compte épargne
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter du taux de rémunération du compte épargne
	 * @param tauxRemuneration Taux de rémunération du compte épargne
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return "CompteEpargne [getId()=" + getId() + ", getSolde()=" + getSolde() + "]";
	}

	
	
}
