package service.tests;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteCourant;
import metier.CompteEpargne;
import metier.Conseiller;
import service.IConseillerService;
import service.ConseillerService;
import service.exceptions.ClientGererParAutreConseillerException;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class VirementCompteACompteTests {

	@Test
	public void testEffectuerVirementSoldeEmetteurEstDebite() throws SoldeInsuffisantException, MontantNegatifException, SQLException, ClientGererParAutreConseillerException {
		IConseillerService cs = new ConseillerService();
		CompteEpargne c1 = new CompteEpargne();
		CompteCourant c2 = new CompteCourant();
		Conseiller cons = new Conseiller();
	
		c1.setSolde(1000);
		c2.setSolde(300);
		cs.effectuerVirement(cons, c1, c2, 500);
	
		Assert.assertEquals(500, c1.getSolde(), 0);
	}

	@Test
	public void testEffectuerVirementSoldeRecepteurEstCredite() throws SoldeInsuffisantException, MontantNegatifException, SQLException, ClientGererParAutreConseillerException {
		IConseillerService cs = new ConseillerService();
		CompteEpargne c1 = new CompteEpargne();
		CompteCourant c2 = new CompteCourant();
		Conseiller cons = new Conseiller();
	
		c1.setSolde(1000);
		c2.setSolde(300);
		cs.effectuerVirement(cons, c1, c2, 500);
	
		Assert.assertEquals(800, c2.getSolde(), 0);
	}

	@Test(expected = MontantNegatifException.class)
	public void testEffectuerVirementMontantNegatif() throws SoldeInsuffisantException, MontantNegatifException, SQLException, ClientGererParAutreConseillerException {
		IConseillerService cs = new ConseillerService();
		CompteEpargne c1 = new CompteEpargne();
		CompteCourant c2 = new CompteCourant();
		Conseiller cons = new Conseiller();
	
		cs.effectuerVirement(cons, c1, c2, -20);
	}

	@Test(expected = SoldeInsuffisantException.class)
	public void testEffectuerVirementCompteCourantSoldeInsuffisant() throws SoldeInsuffisantException, MontantNegatifException, SQLException, ClientGererParAutreConseillerException {
		IConseillerService cs = new ConseillerService();
		CompteCourant cc = new CompteCourant();
		cc.setSolde(1000);
		CompteEpargne ce = new CompteEpargne();
		Conseiller cons = new Conseiller();
		
		cs.effectuerVirement(cons, cc, ce, 3000);
	}

	@Test(expected = SoldeInsuffisantException.class)
	public void testEffectuerVirementCompteEpargneSoldeInsuffisant() throws SoldeInsuffisantException, MontantNegatifException, SQLException, ClientGererParAutreConseillerException {
		IConseillerService cs = new ConseillerService();
		CompteCourant cc = new CompteCourant();
		CompteEpargne ce = new CompteEpargne();
		ce.setSolde(1000);
		Conseiller cons = new Conseiller();
		
		cs.effectuerVirement(cons, ce, cc, 2000);
	}

}
