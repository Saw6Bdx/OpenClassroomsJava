package com.sdz.ville;

public class NombreHabitantException extends Exception {
	public NombreHabitantException() {
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants n�gatif !");
	}
	public NombreHabitantException(int nbre)
	{
	  System.out.println("Instanciation avec un nombre d'habitants n�gatif.");
	  System.out.println("\t => " + nbre);
	}
}