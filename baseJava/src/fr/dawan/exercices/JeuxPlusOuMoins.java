package fr.dawan.exercices;

public class JeuxPlusOuMoins {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		//Nombre g�n�rer par l'ordi
		int nombre_secret;
		//Nombre que l'utilisateur rentrera a chauqe fois 
		int nombreUtilisateur;
		//Permet � l'utilisateur de savoir en comboien de coup i la toruv� le nobmre 
		int nombreDeCoup;
		//[0, 1] *999 ==> [0, 999] + 1 ==> [1, 1000]
		nombre_secret = (int)((Math.random()*999) + 1);	
		
		do {
			System.out.println("Entrez un nombre entre 1 et 1000");
			nombreUtilisateur = clavier.nextInt();
			
			if(nombreUtilisateur == nombre_secret) {
				System.out.println("Trouver " + nombreDeCoup + " essais ! Bien jou� !");
				
				else if(nombreUtilisateur > nombre_secret) {
					
				}
			}
			
		}
	}

}
