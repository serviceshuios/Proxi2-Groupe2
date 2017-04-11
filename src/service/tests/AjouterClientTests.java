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

public class AjouterClientTests {

	@Test
	public void testAjouterClientAuConseiller() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException  {
		IConseillerService cs = new ConseillerService();
		Client client = new Client();
		Conseiller cons = new Conseiller();

		cs.ajouterClient(cons, client, "testnom", "testprenom", "testadresse", "testtelephone", "testville", "testemail", "testcodepostal");

		Assert.assertTrue(cons.getClients().contains(client));
	}

	@Test
	public void testAjouterConseillerAuClient() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException {
		IConseillerService cs = new ConseillerService();
		Client client = new Client();
		Conseiller cons = new Conseiller();

		cs.ajouterClient(cons, client, "testnom", "testprenom", "testadresse", "testtelephone", "testville", "testemail", "testcodepostal");

		Assert.assertEquals(cons, client.getConseiller());
	}

	@Test(expected = NombreClientsMaxAtteintException.class)
	public void testAjouterClientConseillerPlein() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException {
		IConseillerService cs = new ConseillerService();
		Conseiller cons = new Conseiller();
		// ajoute 10 clients au conseiller
		for (int i = 1; i < 11; i++) {
			Client client = new Client();
			client.setId(i);
			cs.ajouterClient(cons, client, "testnom", "testprenom", "testadresse", "testtelephone", "testville", "testemail", "testcodepostal");

		}

		// Ajoute un onzieme eme client, l�ve une exception
		Client client = new Client();
		client.setId(11);
		cs.ajouterClient(cons, client, "testnom", "testprenom", "testadresse", "testtelephone", "testville", "testemail", "testcodepostal");
	}

	@Test(expected = ClientPossedeDejaConseillerException.class)
	public void testAjouterClientDejaConseiller() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException {
		IConseillerService cs = new ConseillerService();
		Client cl1 = new Client();
		cl1.setId(1);
		Conseiller cs1 = new Conseiller();
		cs1.setId(1);
		cl1.setConseiller(cs1);

		Conseiller cs2 = new Conseiller();
		cs2.setId(2);

		// ajouter un client qui a deja un conseiller leve l'exception
		cs.ajouterClient(cs2, cl1, "testnom", "testprenom", "testadresse", "testtelephone", "testville", "testemail", "testcodepostal");
	}
}
