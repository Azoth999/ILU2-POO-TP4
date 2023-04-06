package produit;

public class Poisson extends Produit {
	
	private String nom = "poisson";
	private String unite = "kg";
	private String date;

	public Poisson(String date) {
		this.date = date;
	}
	
	@Override
	public String description() {
		StringBuilder texte = new StringBuilder();
		texte.append(this.nom + " pêchés " + this.date);
		return texte.toString();
	}

}
