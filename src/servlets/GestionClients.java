package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GestionClients
 */
@WebServlet("/GestionClients")
public class GestionClients extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
	
		if(request.getParameter("action").equals("modifierClient"))
		{
			
			request.getRequestDispatcher("/modifierClient.jsp").forward(request,response);
		}
		if(request.getParameter("action").equals("authentification"))
		{
			
			request.getRequestDispatcher("/authentification.jsp").forward(request,response);
		}
		if(request.getParameter("action").equals("listerClients"))
		{
			
			request.getRequestDispatcher("/listerClients.jsp").forward(request,response);
		}
		if(request.getParameter("action").equals("listerComptes"))
		{
			
			request.getRequestDispatcher("/listerComptes.jsp").forward(request,response);
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
