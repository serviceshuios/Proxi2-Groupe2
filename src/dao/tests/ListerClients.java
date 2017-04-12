package dao.tests;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import dao.DAO;
import dao.Idao;
import metier.Client;
import metier.Conseiller;
import service.ConseillerService;
import service.IConseillerService;
import service.exceptions.ClientPossedeDejaConseillerException;
import service.exceptions.NombreClientsMaxAtteintException;

public class ListerClients {

	@Test
	public void testAjouterClientAuConseiller() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException, ClassNotFoundException  {
		Idao idao = new DAO();
		Conseiller cons = new Conseiller();
		cons.setId(1);

		Assert.assertTrue(idao.listerClients(cons).size()==1);
	}
}
