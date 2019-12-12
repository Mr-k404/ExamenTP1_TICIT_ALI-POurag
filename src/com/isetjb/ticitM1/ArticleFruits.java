package com.isetjb.ticitM1;

public class ArticleFruits extends Articles implements VenteKilos{
	private int stock=0;
	
	

	public ArticleFruits(double prixAchat, double prixVente, String nom, String fournisseur, int stock) {
		super(prixAchat, prixVente, nom, fournisseur);
		this.stock = stock;
	}

	


	@Override
	public String toString() {
		return "ArticleFruits [stock=" + stock + "]";
	}




	@Override
	public double VenteKilos(double qte) {
		double rvn=qte*this.prixVente;
		this.stock-=qte;
			return rvn;		
	}

public double remplirStock(int qt) {
		
		this.stock+=qt;
		double prixAT =this.prixAchat*stock;
		return prixAT;
		
	}
public void info () {
	super.afficher();
	System.out.println(toString());

	
}

}
