package tp2;

public class Compte {

	protected long numero ;
	protected float solde ;
	protected  Client2 client;

	
	public Compte(long numero, float solde ,Client2 c) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.client=c;

		
	}
	public Compte(long num , Client2 c) {
		this.numero=num;
		this.client=c;
		this.solde=0;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public Client2 getClient() {
		return client;
	}
	
	public   void deposer(float mnt) {
		this.solde+=mnt;
			
	}
	
	public  void retirer (float mnt) {
		if(this.solde>=mnt) {
		this.solde-=mnt;}else
		{System.out.println("Opss! solde insuffisant !");}
			
	}
	
	public  void virerVers  (float mnt ,Compte c) {
		this.retirer(mnt);
		c.deposer(mnt);
			
	}

	public String toString() {
		return "nom client : " + client.getNom() + " | solde  : " + solde;
	}
	
	public static void main(String[] args) {

		Client2 c1 =new Client2(1,"Gold");
		Client2 c2 =new Client2(2,"Silver");
		Compte cp1=new Compte(1,c1);
		Compte cp2=new Compte(2,c2);
		System.out.println(cp1.toString());
		System.out.println(cp2.toString());
		cp1.deposer(50);
		cp2.deposer(100);
		System.out.println(cp1.toString());
		System.out.println(cp2.toString());
		cp1.virerVers(50, cp2);
		System.out.println(cp1.toString());
		System.out.println(cp2.toString());
		


	}
	
}
