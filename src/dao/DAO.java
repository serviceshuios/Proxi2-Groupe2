package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;

import metier.Client;
import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;
import metier.Conseiller;
import service.exceptions.ClientInexistantException;

public class DAO implements Idao {

	@Override
	public Collection<Client> listerClients() throws ClassNotFoundException {
		Collection<Client> cl = new ArrayList<Client>();
		try {
			Connection conn = DAOConnexion.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT nomClient, prenomClient, entreprise from client");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Client c = new Client();
				c.setNom(rs.getString("nomClient"));
				c.setPrenom(rs.getString("prenomClient"));
				c.setEntreprise(rs.getBoolean("entreprise"));
				cl.add(c);

			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
		return cl;

	}

	@Override
	public void modifierClient(int idClient, String prenom, String nom, String ville, String adresse, String codepostal,
			String email) {
		try {

			Connection conn = DAOConnexion.getConnection();
			PreparedStatement ps1 = conn
					.prepareStatement("UPDATE Client SET nomClient = ? , prenomClient = ?  where id=?");
			ps1.setString(1, nom);
			ps1.setString(2, prenom);
			ps1.setInt(3, idClient);
			ps1.executeUpdate();
			PreparedStatement ps2 = conn
					.prepareStatement("UPDATE Coordonnees SET email = ?, adresse = ?, ville = ?, codepostal = ? "
							+ "where client.idClient=coordonnees.idClient");
			ps2.setString(1, email);
			ps2.setString(2, adresse);
			ps2.setString(3, ville);
			ps2.setString(4, codepostal);
			ps2.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}

	@Override
	public Collection<Compte> listerComptes() {
		Collection<Compte> co = new ArrayList<Compte>();
		try {
			Connection conn = DAOConnexion.getConnection();
			PreparedStatement ps = conn
					.prepareStatement("SELECT nomClient, prenomClient, soldeCompteCourant, soldeCompteEpargne "
							+ "FROM compteepargne, comptecourant, client"
							+ "WHERE client.idClient=comptecourant.idClient"
							+ "AND client.idClient=compteepargne.idClient");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Compte c = new CompteCourant();
				c.getClient().setNom(rs.getString("nomClient"));
				c.getClient().setPrenom(rs.getString("prenomClient"));
				c.setSolde(rs.getDouble("soldeCompteCourant"));
				co.add(c);
				Compte ce = new CompteEpargne();
				ce.getClient().setNom(rs.getString("nomClient"));
				ce.getClient().setPrenom(rs.getString("prenomClient"));
				ce.setSolde(rs.getDouble("soldeCompteEpargne"));
				co.add(ce);

			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
		return co;
	}

	@Override
	public void ajoutSolde(Compte c, double montant) throws SQLException {
		Connection conn = DAOConnexion.getConnection();
		if (c instanceof CompteCourant) {
			PreparedStatement ps = conn.prepareStatement("UPDATE soldeCompteCourant from comptecourant"
					+ "where idCompteCourant = ?" + "having soldeCompteCourant+=?");
			try {
				ps.setLong(1, c.getId());
				ps.setDouble(2, montant);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		PreparedStatement ps = conn.prepareStatement("UPDATE soldeCompteEpargne from compteepargne"
				+ "where idCompteEpargne = ?" + "having soldeCompteEpargne+=?");
		try {
			ps.setLong(1, c.getId());
			ps.setDouble(2, montant);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void retraitSolde(Compte c, double montant) throws SQLException {
		Connection conn = DAOConnexion.getConnection();
		if (c instanceof CompteCourant) {
			PreparedStatement ps = conn.prepareStatement("UPDATE soldeCompteCourant from comptecourant"
					+ "where idCompteCourant = ?" + "having soldeCompteCourant-=?");
			try {
				ps.setLong(1, c.getId());
				ps.setDouble(2, montant);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		PreparedStatement ps = conn.prepareStatement("UPDATE soldeCompteEpargne from compteepargne"
				+ "where idCompteEpargne = ?" + "having soldeCompteEpargne-=?");
		try {
			ps.setLong(1, c.getId());
			ps.setDouble(2, montant);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void ajouterClient(Conseiller conseiller, Client client, String nom, String prenom, String adresse,
			String telephone, String ville, String email, String codepostal) throws SQLException {
		Connection conn = DAOConnexion.getConnection();
		client.setConseiller(conseiller);
		try {
			PreparedStatement ps1 = conn.prepareStatement("UPDATE idConseiller from client" + "where idClient = ?");
			ps1.setLong(1, client.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement ps2 = conn.prepareStatement("SELECT idClient from client where idConseiller = ?");
			ps2.setLong(1, conseiller.getId());
			ResultSet rs = ps2.executeQuery();
			Collection<Client> colCl = new ArrayList<Client>();
			while (rs.next()) {
				Client c = new Client();
				c.setId(Integer.parseInt(rs.getString("idClient")));
				colCl.add(c);
			}
			conseiller.setClients(colCl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement ps3 = conn.prepareStatement(
				"INSERT INTO coordonnees(email, adresse, ville, codepostal, telephone)" + "values (?,?,?,?");
		try {
			ps3.setString(1, email);
			ps3.setString(2, adresse);
			ps3.setString(3, ville);
			ps3.setString(4, codepostal);
			ps3.setString(4, telephone);
			ps3.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PreparedStatement ps4 = conn
				.prepareStatement("INSERT INTO client(nomClient, prenomClient)" + "values (?,?,?,?");
		try {
			ps4.setString(1, nom);
			ps4.setString(2, prenom);
			ps4.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void supprimerClient(Client client, int id) throws ClientInexistantException, SQLException {
		if (client.getId() != 0) {
			Connection conn = DAOConnexion.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM client where idClient = ?");
			try {
				ps.setInt(1, id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			throw new ClientInexistantException("Ce client n'existe pas");

	}

}
