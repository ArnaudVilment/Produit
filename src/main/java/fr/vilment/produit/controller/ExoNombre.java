package fr.vilment.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExoNombre
 */
@WebServlet("/exonombre")
public class ExoNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExoNombre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/exonombre.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int nombre = (Integer.parseInt(request.getParameter("nombre")));
		int modulo = (Integer.parseInt(request.getParameter("modulo")));
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("modulo", modulo);
		request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/exonombreresultat.jsp").forward(request, response);
	}

}
