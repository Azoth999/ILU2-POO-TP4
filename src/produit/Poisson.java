package produit;

public class Poisson extends Produit {
	
	private String nom;
	private String unite;
	private String date;

	public Poisson(String nom, String unite, String date) {
		super(nom,unite);
		this.date = date;
	}
	
	@Override
	public String description() {
		StringBuilder texte = new StringBuilder();
		texte.append(this.nom + " pêchés " + this.date);
		return texte.toString();
	}

}
