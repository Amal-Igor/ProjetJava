package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Veuillez entr�e un premier chiffre : ");
		a = clavier.nextInt();
		System.out.println("Veuillez entr�e un deuxi�me chiffre :");
		b = clavier.nextInt();
		System.out.println("Veuillez entr�e un troisi�me chiffre :");
		c = clavier.nextInt();
		
		int z = Math.max(a, Math.max(b, c));
		if (z == a) {
			System.out.println("Le nombre le plus �lev� est le " +a);
		} else {
			System.out.println(z);
		}
	}

}
