package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ConseillerService;
import service.IConseillerService;

/**
 * Servlet implementation class ModifierClient
 */
@WebServlet("/ModifierClient")
public class ModifierClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");
		String codepostal = request.getParameter("codepostal");
		String id = request.getParameter("id");

		IConseillerService ics = new ConseillerService();
		ics.modifierClient(Integer.parseInt(id), prenom, nom, ville, adresse, codepostal, email, telephone);

		request.getRequestDispatcher("/editionClients.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
