package villagegaulois;

import personnages.Gaulois;
import produit.*;

public class Etal<P extends Produit> implements IEtal {
	private Gaulois vendeur;
	private P[] tabProduits;
	private int nbProduit;
	private int prix;

	@Override
	public Gaulois getVendeur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double donnerPrix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double acheterProduit(int quantiteSouhaitee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String etatEtal() {
		// TODO Auto-generated method stub
		return null;
	}
}
