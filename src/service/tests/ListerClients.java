package service.tests;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import metier.Client;
import metier.Conseiller;
import service.ConseillerService;
import service.IConseillerService;
import service.exceptions.ClientPossedeDejaConseillerException;
import service.exceptions.NombreClientsMaxAtteintException;

public class ListerClients {

	@Test
	public void testListerClient()  {
		IConseillerService cs = new ConseillerService();
		Client client = new Client();
		Conseiller cons = new Conseiller();

		cs.ajouterClient(cons, client, "testnom", "testprenom", "testadresse", "testtelephone", "testville", "testemail", "testcodepostal");

		Assert.assertTrue(cons.getClients().contains(client));
	}
}
