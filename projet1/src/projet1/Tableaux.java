package projet1;

import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
		/*char tableauCaractere[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		int i = 0;
		char reponse = ' ', carac = ' ';
		Scanner sc = new Scanner(System.in);

		do {// Boucle principale
			do {// On répète cette boucle tant que l'utilisateur n'a pas rentré une lettre
				// figurant dans le tableau
				i = 0;
				System.out.println("Rentrez une lettre en minuscule, SVP ");

				carac = sc.nextLine().charAt(0);
				// Boucle de recherche dans le tableau
				while (i < tableauCaractere.length && carac != tableauCaractere[i])
					i++;

				// Si i < 7 c'est que la boucle n'a pas dépassé le nombre de cases du tableau
				if (i < tableauCaractere.length)
					System.out.println(" La lettre " + carac + " se trouve bien dans le tableau !");
				else // Sinon
					System.out.println(" La lettre " + carac + " ne se trouve pas dans le tableau !");

			} while (i >= tableauCaractere.length);

			// Tant que la lettre de l'utilisateur ne correspond pas à une lettre du tableau
			do {
				System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			} while (reponse != 'N' && reponse != 'O');
		} while (reponse == 'O');

		System.out.println("Au revoir !");*/
		
		String[] tabStr = {"toto", "titi", "tata"};
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};

		//La méthode avec un tableau de String sera invoquée
		parcourirTableau(tabStr);
		//La méthode avec un tableau d'int sera invoquée
		parcourirTableau(tabInt);
		//La méthode avec un tableau de String à deux dimensions sera invoquée
		parcourirTableau(tabStr2);
	}
	
	
	static void parcourirTableau(String[] tabBis) {
		for(String str : tabBis)
			System.out.println(str);
	}
	
	static void parcourirTableau(int[] tab)
	{
	  for(int str : tab)
	    System.out.println(str);
	}
	
	static void parcourirTableau(String[][] tab)
	{
	  for(String tab2[] : tab)
	  {
	    for(String str : tab2)
	      System.out.println(str);
	  }
	}
	
	static String toString(String[] tab)
	  {
	    System.out.println("Méthode toString() !\n----------");
	    String retour = "";
	                   
	    for(String str : tab)
	      retour += str + "\n"; 
	                   
	    return retour;
	  }         
}