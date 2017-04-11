package metier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe repr�sentant les conseiller de l'agence. Elle h�rite de la classe Personne
 * @author J�rome IZARD et Perrine EMIN
 *
 */
public class Conseiller extends Personne {

	private Agence agence;
	private Collection<Client> clients = new ArrayList<Client>();
	
	/**
	 * Getter de l'agence du conseiller
	 * @return Agence du conseiller
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * Setter de l'agence du conseiller
	 * @param agence Agence du conseiller
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	/**
	 * Getter des clients du conseiller
	 * @return Clients du conseiller
	 */
	public Collection<Client> getClients() {
		return clients;
	}

	/**
	 * Setter des clients du conseiller
	 * @param clients Clients du conseiller
	 */
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "[Conseiller : "+ getPrenom()+ " "+ getNom()+"]";
	}

	
}
