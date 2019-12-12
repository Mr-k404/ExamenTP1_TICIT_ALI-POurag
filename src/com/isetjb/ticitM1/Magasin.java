package com.isetjb.ticitM1;

import java.util.Arrays;
/*
 * 
 * Hagtic
 * 
 */
public class Magasin {
	
	int nbrE;
	int nbrF ;
	double depenses ;
	double revenus;
	ArticleElectromenager []  Ae =new ArticleElectromenager[0] ;
	ArticleFruits [] Af = new ArticleFruits[0];
	
	public Magasin(int nbrE, int nbrF, double depenses, double revenus) {
		super();
		this.nbrE = nbrE;
		this.nbrF = nbrF;
		this.depenses = depenses;
		this.revenus = revenus;
	}

	@Override
	public String toString() {
		return "Magasin [nbrE=" + nbrE + ", nbrF=" + nbrF + ", depenses=" + depenses + ", revenus=" + revenus + ", Ae="
				+ Arrays.toString(Ae) + ", Af=" + Arrays.toString(Af) + "]";
	}
	
	public void info () {
		
		System.out.println(toString());

		
	}
	
	public double benefice() {
		double benA=0 ;
		double benF=0 ;
		for (int i = 0; i < Ae.length; i++) {
			benA+= Ae[i].benefice();
		}
		
		for (int j = 0; j < Af.length; j++) {
			benF+= Af[j].benefice();
		}
		
		
		
		return benA+benF;
		
		
	}


}
