package fr.vilment.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.vilment.produit.beans.Produit;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/produit")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Produit p1 = new Produit("Deo Axe", 5.2, "ressources/images/axe.jpg", "");
		Produit p2 = new Produit("Spay Axe", 3.2, "ressources/images/axe.png", "");
		Produit p3 = new Produit("Baguette", 1.2, "ressources/images/baguette.jpg", "");
		Produit p4 = new Produit("Cristaline", 3.2, "ressources/images/cristaline.jpg", "");
		Produit p5 = new Produit("Evian", 3.2, "ressources/images/evian.jpg", "");
		Produit p6 = new Produit("Lait", 6.2, "ressources/images/lait.jpg", "");
		Produit p7 = new Produit("Lindt", 3.2, "ressources/images/lindt.jpg", "");
		Produit p8 = new Produit("Th�", 6.0, "ressources/images/the.jpg", "");
		Produit p9 = new Produit("Caf�", 1.2, "ressources/images/cafe.jpg", "");
		
		/* Alors r�cup�ration de la map des clients dans la session */
		ArrayList produits = new ArrayList<Produit>();
		
		produits.add(p1);
		produits.add(p2);
		produits.add(p3);
		produits.add(p4);
		produits.add(p5);
		produits.add(p6);
		produits.add(p7);
		produits.add(p8);
		
		/* Et enfin (r�)enregistrement de la map en session */
		request.setAttribute("produits", produits);
		
		request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/produits.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
