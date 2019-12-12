package tp2;

import java.util.ArrayList;

public class Client2 {
	
	private long code;
	private String nom;
	private  ArrayList<Compte> l ;
	
	

	public Client2(long code, String nom, ArrayList l) {
		super();
		this.code = code;
		this.nom = nom;
		this.l = new ArrayList<Compte>();
	}

	public Client2(long code, String nom) {
		super();
		this.code = code;
		this.nom = nom;

	}

	

	
	public long getCode() {
		return code;
	}




	public void setCode(long code) {
		this.code = code;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public ArrayList<Compte> getL() {
		return l;
	}




	



    public void addCompte (Compte c) {
    	this.l.add(c);
    	
    }
    
    
	@Override
	public String toString() {
		return "les comptes est :" + l  ;
	}
	
	public static void main(String[] args) {

		Client2 c1 = new Client2(1, "Gold");
		Compte cp1 = new Compte(1, c1);
		Compte cp2 = new Compte(2, c1);
		Compte cp3 = new Compte(3, c1);
		cp1.deposer(50);
		cp2.deposer(100);
		cp3.deposer(150);
		c1.addCompte(cp1);
		c1.addCompte(cp2);
		c1.addCompte(cp3);
		System.out.println(c1.toString());
	}
}
		