package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleDoWhile {
	/*
	 * La boucle DO-WHILE permet de repeter des insctructions tant qu'une condition n'est pas v?rifi?e
	 * Comme la condition est test?e ? la fin on est sur  de passer dans le bloc d'insctruction au moins une fois (p30)
	 * 
	 */
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int age = 0;
		do {
			age+=1;
			System.out.println("Vous avez " + age + " ans.");
		}
		while(age < 20);
	}

}
