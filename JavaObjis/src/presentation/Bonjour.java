package presentation;

import metier.Personne;
import metier.Voyageur;

public class Bonjour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour Java ");
		Personne personne1 = new Personne("Josiane", "Michelin");
		Personne personne2 = new Personne("Elronde", "GrisMaison", "Mr", "elronde@tolkien.ceseraitcool");
		Personne p3 = new Personne();
		
		System.out.println(personne1);
		System.out.println(personne2);
		
		System.out.println("MAJ");
		p3.setNom("Lully");
		p3.setPrenom("Gylliann");
		p3.setCivilite("Miss");
		p3.setEmail("test@gmail.com");
		System.out.println(p3);
		
		
		
		Voyageur v1 = new Voyageur("voyageur1");
		v1.setPieceIdentite("Passeport");
		v1.setAge(28);
		
		System.out.println(v1);
	}

}
