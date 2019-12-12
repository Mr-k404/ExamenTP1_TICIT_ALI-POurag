package com.isetjb.ticitM1;

public class ArticleElectromenager extends Articles implements VentePieces,VenteSolde   {
	private int stock=0;
	
	

	public ArticleElectromenager(double prixAchat, double prixVente, String nom, String fournisseur, int stock) {
		super(prixAchat, prixVente, nom, fournisseur);
		this.stock = stock;
	}
	
	
	public double remplirStock(int qt) {
		
		this.stock+=qt;
		double prixAT =this.prixAchat*stock;
		return prixAT;
		
	}
	
	
	
	@Override
	public String toString() {
		return "ArticleElectromenager [stock=" + stock + "]";
	}


	public void info () {
		super.afficher();
		System.out.println(toString());

		
	}

	@Override
	public void lancerSolde(double p) {
		
		this.prixVente+=this.prixVente*p/100;
		
	}

	@Override
	public void terminerSolde(double p) {
		this.prixVente-=this.prixVente*p/100;
		
	}


	@Override
	public double Vendre(int qte) {
		double rvn=qte*this.prixVente;
		this.stock-=qte;
			return rvn;
	}

	

}
