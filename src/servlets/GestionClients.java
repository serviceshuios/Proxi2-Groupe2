package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import metier.Client;
import metier.Conseiller;
import service.ConseillerService;
import service.IConseillerService;

/**
 * Servlet implementation class GestionClients
 */
@WebServlet("/GestionClients")
public class GestionClients extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IConseillerService ics = new ConseillerService();

    /**
     * Default constructor. 
     */
    public GestionClients() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		if (session.getAttribute("leConseiller")!=null){
		
		Conseiller cons = (Conseiller) session.getAttribute("leConseiller");
		
		if(request.getParameter("action").equals("editionClient"))
		{
			
			request.getRequestDispatcher("/editionClient.jsp").forward(request,response);
		}

		
		if(request.getParameter("action").equals("listeClients"))
		{
			
			//2- Traitement avec la couche service
			Collection<Client> listeClients=new ArrayList();
			try {
				listeClients = ics.listerClients(cons);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//3- Préparation de l'envoi
			// Premier paramètre : nom de l'attribut que l'on veut envoyer à la JSP
			// Deuxième paramètre : objet que l'on veut envoyer
			// En général, on met le même nom pour les deux paramètres
			request.setAttribute("listeClients", listeClients);
			//4 Envoi à la JSP	
			request.getRequestDispatcher("/listeClients.jsp").forward(request,response);
		}
		
		if(request.getParameter("action").equals("listeComptesClients"))
		{
			
			request.getRequestDispatcher("/listeComptesClient.jsp").forward(request,response);
		}
		
		if(request.getParameter("action").equals("virementCompteACompte"))
		{
			
			request.getRequestDispatcher("/virementCompteACompte.jsp").forward(request,response);
		}
		
		if(request.getParameter("action").equals("erreur"))
		{
			
			request.getRequestDispatcher("/erreur.jsp").forward(request,response);
		}
		}
		else{
			request.getRequestDispatcher("/authentificationConseiller.jsp").forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
