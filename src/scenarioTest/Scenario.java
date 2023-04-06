package scenarioTest;

import personnages.Gaulois;
import villagegaulois.*;
import villagegauloisold.DepenseMarchand;
import produit.*;

public class Scenario {

	private static class Village implements IVillage{
		
		private Etal[] marche = new Etal[3];

		@Override
		public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
			for (int i = 0; i < marche.length; i++) {
				if (marche[i] == null) {
					etal.installerVendeur(vendeur, produit, prix);
					return true;
				}
			}
			return false;
		}

		@Override
		public DepenseMarchand[] acheterProduit(String produit, int quantiteSouhaitee) {
			DepenseMarchand depense[] = new DepenseMarchand[5];
			for (int i = 0; i < marche.length; i++) {
				if (marche[i]!=null) {
					int prodAchetes=marche[i].contientProduit(produit, quantiteSouhaitee);
					if (prodAchetes>0) {
						double sommeDepense = marche[i].acheterProduit(prodAchetes);
						depense[i] = new DepenseMarchand(marche[i].getVendeur(), prodAchetes, produit, sommeDepense);
						quantiteSouhaitee -= prodAchetes;
					}
				}
			}
			return depense;
		}
		
		@Override
		public String toString() {
			StringBuilder texte = new StringBuilder();
			for (int i = 0; i < marche.length; i++) {
				if(marche[i]!=null) {
					texte.append(marche[i].etatEtal());
				}
			}
			return texte.toString();
		}
	};

	
	public static void main(String[] args) {

		

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<Sanglier>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<Sanglier>();
		Etal<Poisson> etalPoisson = new Etal<Poisson>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };
		
		Village village = new Village();
		
		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		DepenseMarchand[] depense = village.acheterProduit("sanglier", 3);

		for (int i = 0; i < depense.length && depense[i] != null; i++) {
			System.out.println(depense[i]);
		}

		System.out.println(village);

	}

}
