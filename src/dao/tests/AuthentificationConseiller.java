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

public class AuthentificationConseiller {

	@Test
	public void testAuthentificationConseiller() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException, ClassNotFoundException  {
		Idao idao = new DAO();
		Assert.assertTrue(idao.authentificationConseiller("test", "test").getId()==1);
	}
	
	@Test
	public void testAuthentificationConseiller2() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException, ClassNotFoundException  {
		Idao idao = new DAO();
		Assert.assertTrue(idao.authentificationConseiller("login", "mdp").getId()==0);
	}
	
	@Test
	public void testAuthentificationConseiller3() throws ClientPossedeDejaConseillerException, NombreClientsMaxAtteintException, SQLException, ClassNotFoundException  {
		Idao idao = new DAO();
		Assert.assertTrue(idao.authentificationConseiller("test2", "test2").getId()==2);
	}

	
}
