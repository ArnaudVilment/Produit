package fr.vilment.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArrayListServlet
 */
@WebServlet("/arraylist")
public class ArrayListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArrayListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("France");
		villes.add("Belgique");
		villes.add("Espagne");
		villes.add("Portugal");
		villes.add("USA");
		villes.add("Chine");
		villes.add("Canada");
		
		//villes.remove(2);
		//villes.remove("USA");
		
		request.setAttribute("villes", villes);
		request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/arraylist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
