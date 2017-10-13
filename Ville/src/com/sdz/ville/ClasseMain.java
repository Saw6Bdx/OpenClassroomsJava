package com.sdz.ville;

public class ClasseMain {

	public static void main(String[] args) {
		Ville v = null;
		try {
			v = new Ville("Re", -12000, "France");
		}
		// Gestion de plusieurs exceptions différentes
		catch (NombreHabitantException | NomVilleException e2) {
			System.out.println(e2.getMessage());
		} finally {
			if (v == null)
				v = new Ville();
		}
		System.out.println(v.toString());

		/*
		 * Ville v = null;
		 * 
		 * try { v = new Ville("Re", 12000, "France"); }
		 * 
		 * //Gestion de l'exception sur le nombre d'habitants catch
		 * (NombreHabitantException e) { e.printStackTrace(); }
		 * 
		 * //Gestion de l'exception sur le nom de la ville catch(NomVilleException e2){
		 * System.out.println(e2.getMessage()); } finally{ if(v == null) v = new
		 * Ville(); }
		 * 
		 * System.out.println(v.toString());
		 */

		/*
		 * Ville v = new Ville();
		 * System.out.println("Le nombre d'instances de la classe Ville est : " +
		 * Ville.nbreInstances);
		 * System.out.println("Le nombre d'instances de la classe Ville est : " +
		 * Ville.getNombreInstancesBis());
		 * 
		 * try { Ville v1 = new Ville("Marseille", 1236, "France"); } catch
		 * (NombreHabitantException e) { // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * System.out.println("Le nombre d'instances de la classe Ville est : " +
		 * Ville.nbreInstances);
		 * System.out.println("Le nombre d'instances de la classe Ville est : " +
		 * Ville.getNombreInstancesBis()); }
		 * 
		 * try { Ville v2 = new Ville("Rio", 321654, "Brésil"); } catch
		 * (NombreHabitantException e) { // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * System.out.println("Le nombre d'instances de la classe Ville est : " +
		 * Ville.nbreInstances);
		 * System.out.println("Le nombre d'instances de la classe Ville est : " +
		 * Ville.getNombreInstancesBis()); }
		 * 
		 * Capitale cap = new Capitale("Paris", 654987, "France", "la tour Eiffel");
		 * System.out.println("\n" + cap.decrisToi());
		 * 
		 * // Définition d'un tableau de villes null Ville[] tableau = new Ville[6];
		 * 
		 * // Définition d'un tableau de noms de villes et un autre de nombres
		 * d'habitants String[] tab = { "Marseille", "lille", "caen", "lyon", "paris",
		 * "nantes" }; int[] tab2 = { 123456, 78456, 654987, 75832165, 1594, 213 };
		 * 
		 * // Les trois premiers éléments du tableau seront des villes, // et le reste,
		 * des capitales for (int i = 0; i < 6; i++) { if (i < 3) { Ville V = new
		 * Ville(tab[i], tab2[i], "france"); tableau[i] = V; }
		 * 
		 * else { Capitale C = new Capitale(tab[i], tab2[i], "france",
		 * "la tour Eiffel"); tableau[i] = C; } }
		 * 
		 * // Il ne nous reste plus qu'à décrire tout notre tableau ! for (Ville V :
		 * tableau) { System.out.println(V.decrisToi() + "\n"); }
		 * 
		 * // Il ne nous reste plus qu'à décrire tout notre tableau ! for (Object obj :
		 * tableau) { System.out.println(obj.toString() + "\n"); }
		 */
		/*
		 * Ville v = new Ville(); Ville v1 = new Ville("Marseille", 1236, "France");
		 * Ville v2 = new Ville("Rio", 321654, "Brésil");
		 * 
		 * System.out.println("\n\n"+v1.decrisToi()); System.out.println(v.decrisToi());
		 * System.out.println(v2.decrisToi()+"\n\n");
		 * System.out.println(v1.comparer(v2));
		 */

		/*
		 * Ville v = new Ville(); Ville v1 = new Ville("Marseille", 123456, "France");
		 * Ville v2 = new Ville("Rio", 321654, "Brésil");
		 * 
		 * System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+
		 * " habitants se situant en "+v.getNomPays());
		 * System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()
		 * + " habitants se situant en "+v1.getNomPays());
		 * System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()
		 * + " habitants se situant en "+v2.getNomPays()+"\n\n");
		 * 
		 * //Nous allons interchanger les Villes v1 et v2 tout ça par l'intermédiaire
		 * d'un autre objet Ville. Ville temp = new Ville(); temp = v1; v1 = v2; v2 =
		 * temp;
		 * 
		 * System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()
		 * + " habitants se situant en "+v1.getNomPays());
		 * System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()
		 * + " habitants se situant en "+v2.getNomPays()+"\n\n");
		 * 
		 * //Nous allons maintenant interchanger leurs noms cette fois par le biais de
		 * leurs mutateurs.// v1.setNom("Hong Kong"); v2.setNom("Djibouti");
		 * 
		 * System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()
		 * + " habitants se situant en "+v1.getNomPays());
		 * System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()
		 * + " habitants se situant en "+v2.getNomPays()+"\n\n");
		 */
	}

}