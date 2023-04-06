package produit;

public abstract class Produit implements IProduit{
	private String nom;
	private String unite;
		
	public String getNom() {
		return nom;
	}
	
	public abstract String description();
	
	public abstract int calculerPrix(int prix);
}