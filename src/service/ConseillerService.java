package service;

import java.util.Collection;

import dao.DAO;
import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class ConseillerService implements IConseillerService {
	
	private dao.Idao idao = new DAO();

	@Override
	public Collection<Client> listerClients(Conseiller conseiller, Client c) {
		return idao.listerClients(conseiller, c);

	}

	@Override
	public void effectuerVirement(Compte compteEmetteur, Compte compteRecepteur, double montant) throws SoldeInsuffisantException, MontantNegatifException {
		idao.effectuerVirement(compteEmetteur, compteRecepteur, montant);

	}

	@Override
	public void modifierClient(Conseiller conseiller, Client client) {
		idao.modifierClient(conseiller, client);

	}

	@Override
	public Collection<Compte> listerComptes(Conseiller cons, Client c) {
		return idao.listerComptes(cons, c);
	}

}
