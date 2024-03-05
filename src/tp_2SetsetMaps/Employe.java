package tp_2SetsetMaps;

import java.util.Objects;

public class Employe implements Comparable<Employe>{
	private int cin;
	private String nom;
	private double salaire;
	private int département;
	public Employe(int cin, String nom, double salaire, int département) {
		
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.département = département;
	}
	public Employe(int cin2) {
		this.cin = cin2;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getDépartement() {
		return département;
	}
	public void setDépartement(int département) {
		this.département = département;
	}
	@Override
	public String toString() {
		return "Employé [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", département=" + département + "]";
	}
	@Override
	public int compareTo(Employe o) {
		 if(this.getSalaire()> o.getSalaire())
    	 {
    	 	return -1;
    	 }
     if(this.getSalaire()<o.getSalaire())
	 {
	 	return 1;
	 }
     else
    	 return 0;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return cin == other.cin;
	}

	
	
	
	
	

}
