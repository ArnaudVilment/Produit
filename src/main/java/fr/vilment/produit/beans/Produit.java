package fr.vilment.produit.beans;


public class Produit {
	
	private String nom;
	private Double prix;
	private String lienImage;
	private String lienSiteOff;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit(String nom, Double prix, String lienImage, String lienSiteOff) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.lienImage = lienImage;
		this.lienSiteOff = lienSiteOff;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getLienImage() {
		return lienImage;
	}
	public void setLienImage(String lienImage) {
		this.lienImage = lienImage;
	}
	public String getLienSiteOff() {
		return lienSiteOff;
	}
	public void setLienSiteOff(String lienSiteOff) {
		this.lienSiteOff = lienSiteOff;
	}
	
}