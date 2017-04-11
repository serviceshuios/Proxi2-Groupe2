/**
 * 
 */
package metier;

/**
 * La classe CreditImmobilier permet de d�finir un cr�dit immobilier.
 * @author BERNY OTHMANE
 * @version 1.0
 */
public class CreditImmobilier extends Credit {

	/**
	 * Constructeur de la classe CreditImmobilier avec arguments
	 * @param taux taux du cr�dit
	 * @param duree dur�e du cr�dit
	 * @param montant montant du cr�dit
	 */
	public CreditImmobilier(float taux, int duree, double montant) {
		super(taux, duree, montant);
	}

}
