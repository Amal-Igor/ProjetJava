package fr.dawan.syntaxe_de_base.Transtypage;

public class TranstypageImpliciteEtExplicite {

	public static void main(String[] args) {

		//Transtypage implicite : Concerne le passage d'un type inferieur vers un type superieur
		int i  = 42;
		double d = i;
		System.out.println(d);
		
		//Transtypage explicite (cast)
		//Passage d'un type superieur vers un type inferieur implique de faire un cast
		//Cast : concerne les conversions des types compatibles
		int i1 = 123;
		short s = (short) i1;
		
		double d1 = 44.95;
		int i2 = (int) d1;
		
		//Perte de pr?cision : il faut que le type qui re?oit la valeur ait la capacit? de contenir cette valeur
		//ex : byte [-128 127]
		int i3 = 200;
		byte b = (byte) i3;
		System.out.println(b);
		


	}

}
