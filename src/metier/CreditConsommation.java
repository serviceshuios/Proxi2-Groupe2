package metier;

/**
 * La classe creditConsommation permet de définir un crédit à la consommation.
 * 
 * @author Perrine EMIN et Guillaume OTHMANE
 * 
 */
public class CreditConsommation extends Credit {

	/**
	 * Constructeur de la classe CreditConsommation avec arguments
	 * 
	 * @param taux
	 *            taux du crédit
	 * @param duree
	 *            durée du crédit
	 * @param montant
	 *            montant du crédit
	 */
	public CreditConsommation(float taux, int duree, double montant) {
		super(taux, duree, montant);
	}

}
