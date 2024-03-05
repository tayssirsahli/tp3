package tp_2SetsetMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Entreprise {
	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;

	// constructeurs, getters et setters

public Entreprise(String nomEntreprise) {
	
		this.nomEntreprise = nomEntreprise;
		Liste_Deps = new HashMap<Integer, Departement> ();
	}


//ajouter un département donné à l'entreprise
	public void ajoutDep(Departement d) {

		Liste_Deps.put(d.getIdDep(),d);
	}

//retirer un département de l'entreprise
public void retirerDep(Departement d)
{
	Liste_Deps.remove(d.getIdDep());
}

//à compléter}
//afficher les détails de l'entreprise
	public void afficheE() {

		System.out.println("Entreprise: " + nomEntreprise);
        for (Departement departement : Liste_Deps.values()) {
            departement.afficheDep();
        }
	}

// transfert d'un employé d'un département à l'autre
	public void UpdateDep(Employe E, int idDep)
	{
		Collection<Departement> s = Liste_Deps.values();
		Departement depcurent=null;
			for(Departement d:s)
			{
				if(d.existeE(E.getCin()))
				{
					depcurent=d;
					break;
				}
				
			}
			if (depcurent != null) {
				depcurent.retirerEmploye(E);
				Departement d = Liste_Deps.get(idDep);
				E.setDépartement(idDep);
				d.ajoutEmploye(E);
			}
			
				
		
	}


//vérifier si un département donné en paramètre appartient à la société ou pas

	public boolean existeD(Departement d) {	
		
		return Liste_Deps.containsValue(d);
	}

//afficher le département ayant le plus petit nombre d’employer
public void DepMinCapacity()
{
	if (Liste_Deps.isEmpty()) {
        System.out.println("Aucun département dans l'entreprise.");
        return;
    }
    int minCapacity = Integer.MAX_VALUE;
    Departement minCapacityDep = null;
    for (Departement departement : Liste_Deps.values()) {
        if (departement.getLEmployes().size() < minCapacity) {
            minCapacity = departement.getLEmployes().size();
            minCapacityDep = departement;
        }
    }
    System.out.println("Département avec le moins d'employés (id: " + minCapacityDep.getIdDep() + ")");
}


}
