package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice12 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		String x = "";
		
		System.out.println("Veuillez renseigner une lettre");
		x = clavier.nextLine();
				
		if (x.length() > 1 || x.length() < 0) {
			System.out.println("Vous ne devez rentrer qu'un seul caract?re");
		}else if ( ("aeiou".indexOf(x) < 0 && "AEIOU".indexOf(x) < 0)) {
			System.out.println("La lettre est une consonne");
		} else {System.out.println(" La lettre est une voyelle");};
		
}
		
		
		
	}


