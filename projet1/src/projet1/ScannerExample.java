package projet1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un entier : ");
		int i = sc.nextInt();
		System.out.println("Saisissez une cha�ne : ");
		// On vide la ligne avant d'en lire une autre
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("FIN ! ");
	}

}
