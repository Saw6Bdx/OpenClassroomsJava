package com.sdz.genericity;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		// Liste de voiture
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		listVoiture.add(new Voiture());

		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		listVoitureSP.add(new VoitureSansPermis());
		listVoitureSP.add(new VoitureSansPermis());

		affiche(listVoiture);

		Garage garage = new Garage();
		garage.add(listVoiture);
		System.out.println("--------------------------");
		garage.add(listVoitureSP);
	}

	// Avec cette méthode, on accepte aussi bien les collections de Voiture que les
	// collection de VoitureSansPermis
	static void affiche(List<? super Voiture> list) {

		for (Object v : list)
			System.out.print(v.toString());
	}
}
