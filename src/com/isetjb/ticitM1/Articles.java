package com.isetjb.ticitM1;

public class Articles {
	
	protected double prixAchat;
	protected double prixVente;
	private String nom;
	private String fournisseur;
	
	public Articles(double prixAchat, double prixVente, String nom, String fournisseur) {
		super();
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.nom = nom;
		this.fournisseur = fournisseur;
	}

	 @Override
	 public String toString() {
	 	return "Articles [prixAchat=" + prixAchat + ", prixVente=" + prixVente + ", nom=" + nom + ", fournisseur="
	 			+ fournisseur + "]";
	 }

	
 public double benefice() {
	double bn= this.prixVente - this.prixAchat;
	return bn;
	 
 }
 
 


public void afficher() {
	System.out.println("*********Les Article*********");
	System.out.println(toString());

	 
 }
	
	
	


}
