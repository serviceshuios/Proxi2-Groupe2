package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConnexion {
	private static final String pilote="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/bddproxiv2";
	private static final String user="root";
	private static final String pwd="";
	private static Connection conn=null;
	
	//M�thode de connection
	public static Connection getConnection(){
		if(conn==null){
			try {
				//1- charger le pilote
				Class.forName(pilote);
				//2- cr�er la connexion
				conn = DriverManager.getConnection(URL, user, pwd);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
		}
		else{
			return conn;
		}
	}
	
	//M�thode de d�connexion
	public static void closeConnection(){
		if(conn!=null){
			try {
				conn.close();
				//la fermeture de la connexion n'enclenche pas l'�tat null de la connexion
				conn=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
