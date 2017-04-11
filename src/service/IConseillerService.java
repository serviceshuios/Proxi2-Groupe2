package service;

import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public interface IConseillerService {
	
	public Collection<Client> listerClients(Conseiller cons, Client c);
	public void effectuerVirement(Compte compteEmetteur, Compte compteRecepteur, double montant) throws SoldeInsuffisantException, MontantNegatifException;
	public void modifierClient(Conseiller conseiller, Client client);
	public Collection<Compte> listerComptes(Conseiller cons, Client c);

}
