package fr.vilment.produit.business.impl;

import java.util.ArrayList;

import fr.vilment.produit.beans.User;
import fr.vilment.produit.business.IUsersBusiness;

public class UsersBusiness implements IUsersBusiness {

	public ArrayList<User> getUsers() {
		
		ArrayList<User> users = new ArrayList<User>();
		String dossierImg = "ressources/images/";
		
		User vilment = new User(dossierImg + "axe.jpg", "Vilment", "Arnaud", 38);
		User blanc = new User(dossierImg + "axe.png", "Blanc", "Del", 68);
		User dupond = new User(dossierImg + "cafe.jpg", "Dupond", "Luc", 38);
		User valjean = new User(dossierImg + "evian.jpg", "Valjean", "Jean", 38);
		User brous = new User(dossierImg + "lait.jpg", "Brous", "Willis", 37);
		User blanche = new User(dossierImg + "the.jpg", "Blanche", "Claude", 28);
		User tace = new User(dossierImg + "lindt.jpg", "Tace", "Giles", 68);
		User bouille = new User(dossierImg + "baguette.jpg", "Pouille", "Francois", 18);
		
		users.add(vilment);
		users.add(blanc);
		users.add(dupond);
		users.add(valjean);
		users.add(brous);
		users.add(blanche);
		users.add(tace);
		users.add(bouille);
		
		return users;
	}
}
