package villagegaulois;

import personnages.Gaulois;
import produit.*;

public class Etal<P extends IProduit> implements IEtal {
	private Gaulois vendeur;
	private P[] tabProduits;
	private int nbProduit;
	private int prix;

	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix){
		this.vendeur = vendeur;
		this.nbProduit = produit.length;
		this.tabProduits =(P[]) new IProduit[nbProduit];
		for (int i = 0; i < nbProduit; i++) {
			this.tabProduits[i]= produit[i];
		}
		this.prix = prix;
	}
	
	public Gaulois getVendeur() {
		return this.vendeur;
	}

	public double donnerPrix() {
		return this.prix;
	}

	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if (nbProduit != 0 && this.tabProduits[0].getNom().equals(produit)) {
			if (nbProduit >= quantiteSouhaitee) {
					quantiteAVendre = quantiteSouhaitee;
			} else {
					quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}
	
	public double acheterProduit(int quantiteSouhaitee) {
		double prixPaye = 0;
		for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaitee - 1 || i > 1; i--) {
		prixPaye += tabProduits[i].calculerPrix(prix);
		}
		if (nbProduit >= quantiteSouhaitee) {
		nbProduit -= quantiteSouhaitee;
		} else {
		nbProduit = 0;
		}
		return prixPaye;
	}

	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if (nbProduit > 0) {
			chaine.append(" vend ");
			chaine.append(nbProduit + " produits :");
			for (int i = 0; i < nbProduit; i++) {
				chaine.append("\n- " + tabProduits[i].description());
				}
		} else {
			chaine.append(" n'a plus rien à vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}
}
