package tp2;

import java.util.ArrayList;

public class BanqueApplication {

	public static void main(String[] args) {
		  ArrayList<Client2> c=new  ArrayList<Client2>() ;
		  Client2 c1 = new Client2(1,"client1");
		  Client2 c2 = new Client2(1,"client1");
		  Client2 c3 = new Client2(1,"client1");
		  Client2 c4 = new Client2(1,"client1");

		  c.add(c1);
		  c.add(c2);
		  c.add(c3);
		  c.add(c4);
		  
		  for (int i = 0; i < c.size(); i++) {
			  Client2 clt= c.get(i);
				
				 System.out.println( "Liste des clients  =  [code=" + clt.getCode() + ", Nom=" + clt.getNom() +clt.getL()+ "]");

			}
		  
		  for (int i = 0; i < c.size(); i++) {
			  
			  Client2 clt=c.get(i);
			   CompteCourant cc =new CompteCourant((clt.getCode()*1000+i+1),clt);
			   CompteEpargne ce= new CompteEpargne((clt.getCode()*1000+i+2),clt,cc,50);
			   cc.deposer(1000);
			   ce.transfert(50);
			   clt.addCompte(cc);
			   clt.addCompte(ce);

			}
 
	}

}
