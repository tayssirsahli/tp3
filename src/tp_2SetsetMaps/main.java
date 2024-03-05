package tp_2SetsetMaps;

import java.util.HashSet;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		
		Employe Employe1 = new Employe(1111,"tayssir",3000,1);
		Employe Employe2 = new Employe(22,"ahmed",300,1);

		Set<Employe> LEmployes =new HashSet<>();
		
		Departement d1 =new Departement(1,LEmployes);
		
		d1.ajoutEmploye(Employe2);
		d1.ajoutEmploye(Employe1);
		
		System.out.println("departement 1:");

		d1.afficheDep();
		System.out.println("Max salaire:");
		System.out.println(d1.getEmpSalMax());
		System.out.println("existe employer:");

		System.out.println(d1.existeE(1));
		
		
		
		Employe Employe4 = new Employe(3,"mary",1500,2);
		Employe Employe3 = new Employe(4,"bob",4000,2);

		Set<Employe> LEm =new HashSet<>();

		Departement d2 =new Departement(2,LEm);
		d2.ajoutEmploye(Employe3);
		d2.ajoutEmploye(Employe4);
		System.out.println("departement 2:");

		d2.afficheDep();
		
		
		Entreprise E = new  Entreprise("Entreprise1");

		E.ajoutDep(d1);
		E.ajoutDep(d2);
		
		System.out.println("Entreprise :");

		E.afficheE();

		System.out.println("update :");

		E.UpdateDep(Employe3,1);

		System.out.println("Entreprise aprés update:");

		E.afficheE();
		System.out.println("l'existance de departement:"+E.existeD(d1));
		
		E.DepMinCapacity();
		

	}

}
