package com.sdz.zArmy;

import com.sdz.comportement.Operation;

public class Test {
			public static void main(String[] args) {
				/*Personnage[] tPers = { new Guerrier(), new Civil(), new Medecin() };

				for (int i = 0; i < tPers.length; i++) {
					System.out.println("\nInstance de " + tPers[i].getClass().getName());
					System.out.println("*****************************************");
					tPers[i].combattre();
					tPers[i].seDeplacer();
					tPers[i].soigner();
				}*/
				
				 Personnage pers = new Guerrier();
				    pers.soigner();		
				    pers.setSoin(new Operation());
				    pers.soigner();
			}

/*
 * Personnage[] tPers = { new Guerrier(), new Chirurgien(), new Civil(), new
 * Sniper(), new Medecin() }; String[] tArmes = { "pistolet", "pistolet",
 * "couteau", "fusil à pompe", "couteau" };
 * 
 * for (int i = 0; i < tPers.length; i++) { System.out.println("\nInstance de "
 * + tPers[i].getClass().getName());
 * System.out.println("*****************************************");
 * tPers[i].combattre(); tPers[i].setArmes(tArmes[i]); tPers[i].combattre();
 * tPers[i].seDeplacer(); tPers[i].soigner();
 */

/*
 * Personnage[] tPers = { new Guerrier(), new Chirurgien(), new Civil(), new
 * Sniper(), new Medecin() };
 * 
 * for (Personnage p : tPers) { System.out.println("\nInstance de " +
 * p.getClass().getName());
 * System.out.println("***************************************"); p.combattre();
 * p.seDeplacer(); }
 */
}