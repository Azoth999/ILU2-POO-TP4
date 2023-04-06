package produit;

public abstract class Produit implements IProduit{
	private String nom;
	private int unite;
		
	public String getNom() {
		return nom;
	}
	
	public abstract String description();
}