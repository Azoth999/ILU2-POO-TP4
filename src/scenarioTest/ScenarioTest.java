package scenarioTest;

import produit.*;
import personnages.Gaulois;
import villagegaulois.Etal;

public class ScenarioTest {
	private void afficherMarche(Etal[] marche) {
		StringBuilder texte = new StringBuilder();
	}
	
	public static void main(String[] args) {
				
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
	
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		
		Etal[] marche = new Etal[3];
		Etal<Sanglier> etalSanglier = new Etal<Sanglier>();
		Etal<Poisson> etalPoisson = new Etal<Poisson>();
		marche[0] = etalSanglier;
		marche[1]= etalSanglier;
		marche[2] = etalPoisson;
		
		marche[0].installerVendeur(obelix, sangliersObelix, 8);
		marche[1].installerVendeur(asterix, sangliersAsterix, 10);
		marche[2].installerVendeur(ordralfabetix, poissons, 7);
		
		System.out.println(marche[0].acheterProduit(1));
		
	}
	
}
