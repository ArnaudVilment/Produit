package fr.vilment.produit.business;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.vilment.produit.beans.User;
import fr.vilment.produit.business.impl.UsersBusiness;

/**
 * Servlet implementation class UserInfos
 */
@WebServlet("/user-infos")
public class UserInfos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersBusiness usersBusiness = new UsersBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<User> users = usersBusiness.getUsers();
		
		
		request.setAttribute("user", users.get(Integer.parseInt(request.getParameter("id"))));
		
		request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/user-infos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
