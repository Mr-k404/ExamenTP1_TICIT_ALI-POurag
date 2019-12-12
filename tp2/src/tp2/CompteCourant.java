package tp2;

import java.util.ArrayList;

public class CompteCourant extends Compte {

	public CompteCourant(long numero,Client2 c) {
		super(numero, c);
		
	}

	

	


	public String  toString() {
		return  " Compte courant no : numéro =" + this.getNumero() + ", solde=" + this.getSolde() ;
	}
	
	
}
