package com.isetjb.ticitM1;

public class ProgPrincipal {

	public static void main(String[] args) {
	Magasin	M1=new Magasin(20, 105, 1500, 100);
	
	ArticleElectromenager artA1 =new ArticleElectromenager(30, 45, "micro-ondes", "Ali Ben Salah", 500) ;
	ArticleElectromenager artA2 =new ArticleElectromenager(100, 125, "Four ", "Ali Ben Salah", 270) ;

	ArticleFruits artF1 =new ArticleFruits(1, 1.5, "banane", "Mostfa ben Mostfa", 22);
	ArticleFruits artF2 =new ArticleFruits(1.2, 2, "orange", "Mostfa ben Mostfa", 10);
	
	artA1.remplirStock(20);
	artA2.remplirStock(50);
	artF1.remplirStock(60);
	artF2.remplirStock(10);
	
	artA1.Vendre(2);
	artF2.VenteKilos(3);
	artA2.lancerSolde(10);
	artA2.Vendre(1);
	
	M1.info();



	}

}
