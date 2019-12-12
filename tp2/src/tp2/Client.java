package tp2;

import java.util.Scanner;

public class Client {
	private long code;
	private String nom;
	
	public Client(long code, String string) {
		super();
		this.code = code;
		this.nom = string;
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

	
	@Override
	public String toString() {
		return "Liste des Clients [code=" + code + ", nom=" + nom + "]";
	}
	
	
	}
	
	
