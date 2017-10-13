package com.sdz.ville;

public class Ville {
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;

	// Constructeur par défaut
	public Ville() {
		// On incrémente nos variables à chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
	}

	// Constructeur avec paramètres
	// J'ai ajouté un « p » en première lettre des paramètres.
	// Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
	public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantException, NomVilleException {
		if (pNbre < 0)
			throw new NombreHabitantException(pNbre);
		if(pNom.length() < 3)
		    throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
		else {
			// On incrémente nos variables à chaque appel aux constructeurs
			nbreInstances++;
			nbreInstancesBis++;

			nomVille = pNom;
			nomPays = pPays;
			nbreHabitants = pNbre;
			this.setCategorie();
		}
	}

	// ************* ACCESSEURS *************

	// Retourne le nom de la ville
	public String getNom() {
		return nomVille;
	}

	// Retourne le nom du pays
	public String getNomPays() {
		return nomPays;
	}

	// Retourne le nombre d'habitants
	public int getNombreHabitants() {
		return nbreHabitants;
	}

	// ************* MUTATEURS *************

	// Définit le nom de la ville
	public void setNom(String pNom) {
		nomVille = pNom;
	}

	// Définit le nom du pays
	public void setNomPays(String pPays) {
		nomPays = pPays;
	}

	// Définit le nombre d'habitants
	public void setNombreHabitants(int nbre) {
		nbreHabitants = nbre;
	}

	// Définit la catégorie de la ville
	private void setCategorie() {

		int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];
	}

	// Retourne la description de la ville
	public String decrisToi() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " habitant(s) => elle est donc de catégorie : " + this.categorie;
	}

	// Retourne une chaîne de caractères selon le résultat de la comparaison
	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNombreHabitants() > this.nbreHabitants)
			str = v1.getNom() + " est une ville plus peuplée que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();

		return str;
	}

	public static int getNombreInstancesBis() {
		return nbreInstancesBis;
	}

	public String toString() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " => elle est donc de catégorie : " + this.categorie;
	}

	public int hashCode() {
		// On définit un multiplication impair, de préférence un nombre premier
		// Ceci afin de garantir l'unicité du résultat final
		final int prime = 31;
		// On définit un résultat qui sera renvoyé au final
		int result = 1;
		// On ajoute en eux la multiplication des attributs et du multiplicateur
		result = prime * result + categorie;
		result = prime * result + nbreHabitants;
		// Lorsque vous devez gérer des hashcodes avec des objets dans le mode de calcul
		// Vous devez vérifier si l'objet n'est pas null, sinon vous aurez une erreur
		result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
		result = prime * result + ((nomVille == null) ? 0 : nomVille.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		// On vérifie si les références d'objets sont identiques
		if (this == obj)
			return true;

		// On vérifie si l'objet passé en paramètre est null
		if (obj == null)
			return false;

		// On s'assure que les objets sont du même type, ici de type Ville
		// La méthode getClass retourne un objet Class qui représente la classe de votre
		// objet
		// Nous verrons ça un peu plus tard...
		if (getClass() != obj.getClass())
			return false;

		// Maintenant, on compare les attributs de nos objets
		Ville other = (Ville) obj;
		if (categorie != other.categorie)
			return false;
		if (nbreHabitants != other.nbreHabitants)
			return false;
		if (nomPays == null) {
			if (other.nomPays != null)
				return false;
		} else if (!nomPays.equals(other.nomPays))
			return false;

		if (nomVille == null) {
			if (other.nomVille != null)
				return false;
		} else if (!nomVille.equals(other.nomVille))
			return false;

		return true;
	}
}
