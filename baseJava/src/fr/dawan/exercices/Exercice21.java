package fr.dawan.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice21 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		
		int numbers[] = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Entrez un nombre " + (i + 1) + ": ");
			numbers[i] = clavier.nextInt();
		}
		System.out.println(Arrays.toString(numbers));		
	}

}
