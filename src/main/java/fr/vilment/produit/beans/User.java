package fr.vilment.produit.beans;

public class User {

	private String urlImage;
	private String nom;
	private String prenom;
	private int age;

	public User()  {
		super();
	}

	public User(String urlString, String nom, String prenom, int age) {
		super();
		this.urlImage = urlString;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
