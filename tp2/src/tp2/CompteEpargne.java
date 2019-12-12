package tp2;

public class CompteEpargne extends Compte {
	
	private CompteCourant cct;
	private float mnt;
	

	

	public CompteEpargne(long numero,Client2 c, CompteCourant cct, float mnt) {
		super(numero, c);
		this.cct = cct;
		this.mnt = mnt;
	}

	
  public CompteCourant getCct() {
		return cct;
	}


	public void setCct(CompteCourant cct) {
		this.cct = cct;
	}


	public float getMnt() {
		return mnt;
	}


	public void setMnt(float mnt) {
		this.mnt = mnt;
	}


public void transfert (float mnt){
	  cct.retirer(mnt);
	  this.virerVers(mnt, this);
	  
	  
  }
  
		@Override
		public String toString() {
			return "Compte épargne  : " + getNumero()  + " , solde : " + getSolde() ;
		}
	
}
