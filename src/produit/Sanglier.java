package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {

	private String nom = "sanglier";
	private String unite = "kg";
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		this.chasseur = chasseur;
		this.poids = poids; 
	}
	
	@Override
	public String description() {
		StringBuilder texte = new StringBuilder();
		texte.append(this.nom + " de " + this.poids 
				+ " kg chassé par " 
				+ this.chasseur.getNom());
		return texte.toString();
	}

	@Override
	public int calculerPrix(int prix) {
		return prix*this.poids/1000;
	}
}
