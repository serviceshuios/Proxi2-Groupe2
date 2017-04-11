package metier;

/**
 * La classe creditConsommation permet de d�finir un cr�dit � la consommation.
 * @author BERNY OTHMANE
 * @version 1.0
 */
public class CreditConsommation extends Credit {
	
	/**
	 * Constructeur de la classe CreditConsommation avec arguments
	 * @param taux taux du cr�dit
	 * @param duree dur�e du cr�dit
	 * @param montant montant du cr�dit
	 */
	public CreditConsommation(float taux, int duree, double montant) {
		super(taux, duree, montant);
	}

}
