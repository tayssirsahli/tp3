package tp_2SetsetMaps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<Employe> LEmployes ;

	
	
	
	
	public Departement(int idDep, Set<Employe> lEmployes) {
		
		this.idDep = idDep;
		LEmployes = lEmployes;
	}

	
	/*
	 * ajouter un employe au département courant la fonction n'ajoute que les
	 * employés ayants un CIN valide >0 ne pas oublier de mettre à jour le num dep
	 * de l'employe
	 *
	 */
	
	
	public void ajoutEmploye(Employe E) {

		if(E.getCin() > 0)
		{
			LEmployes.add(E);
			E.setDépartement(idDep);
			
		}
		 
	}

//retirer un employe du département courant
	
	public void retirerEmploye(Employe E) {

		
		LEmployes.remove(E);
	}

//afficher détails du département
	public void afficheDep()
	{
		Iterator<Employe> l = LEmployes.iterator();
		
		System.out.println("departement "+this.getIdDep()+ ":");
		while (l.hasNext())
		{
			System.out.println(l.next().toString());
		}
	
	}

//vérifier si un employé dont le cin est donné en paramètre
// appartient au département courant ou pas
	public boolean existeE(int cin) {
		Employe l = new Employe (cin);
		return LEmployes.contains(l);
			 
		
		
	}



//retourner l'employé qui a le plus grand salaire ds le département
// pensez un utiliser un treeSet
	public Employe getEmpSalMax() {
		
		TreeSet<Employe> ET = new TreeSet<Employe>(LEmployes);
		return ET.first();
		
	}


	public int getIdDep() {
		return idDep;
	}


	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}


	public Set<Employe> getLEmployes() {
		return LEmployes;
	}


	public void setLEmployes(Set<Employe> lEmployes) {
		LEmployes = lEmployes;
	}


	@Override
	public String toString() {
		return "Departement [idDep=" + idDep + ", LEmployes=" + LEmployes + "]";
	}



	
	
}
