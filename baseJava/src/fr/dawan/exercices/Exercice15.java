package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice15 {

	public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	
	int a = 0;
	int b = 0;
	int c = 0;
	
	System.out.println("Veuillez rentrer un nombre : ");
	a = clavier.nextInt();
	b = a%10;	
	while(a != 0) {
		c = a%10;
		a = a/10;
	}
	
	System.out.println("Le premier chiffre est : " + c);
	System.out.println("Le dernier chiffre est : " + b);
	}

}
