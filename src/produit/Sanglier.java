package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {

	private String nom;
	private String unite;
	private int poids;
	private Gaulois chasseur;

	public Sanglier(String nom, String unite, int poids, Gaulois chasseur) {
		super(nom,unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public String description() {
		StringBuilder texte = new StringBuilder();
		texte.append(this.nom + " de " + this.poids + " kg chassé par " + this.chasseur.getNom());
		return texte.toString();
	}
}
