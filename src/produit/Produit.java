package produit;

public abstract class Produit implements IProduit{
	private String nom;
	private String unite;
	
	public Produit(String nom, String unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public abstract String description();
}