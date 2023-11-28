import java.util.EnumMap;
import java.util.Map;

public class testEnummap {
    enum Couleur {
        VERT, JAUNE, ORANGE
    }

    public static void main(String[] args) {
        // Création d'une EnumMap avec une clé de type Enum Couleur et une valeur de type Integer
        EnumMap<Couleur, Integer> prixProduits = new EnumMap<>(Couleur.class);

        // Ajout de quelques données à l'EnumMap
        prixProduits.put(Couleur.VERT, 10);
        prixProduits.put(Couleur.JAUNE, 20);
        prixProduits.put(Couleur.ORANGE, 15);

        // Affichage des prix des produits
        System.out.println("Prix des produits : ");
        afficherPrixProduits(prixProduits);

        // Modification du prix du produit vert
        prixProduits.put(Couleur.VERT, 12);

        // Affichage des prix mis à jour
        System.out.println("\nPrix mis à jour des produits : ");
        afficherPrixProduits(prixProduits);
    }

    // Méthode pour afficher les prix des produits
    private static void afficherPrixProduits(EnumMap<Couleur, Integer> prixProduits) {
        for (Couleur couleur : Couleur.values()) {
            System.out.println(couleur + " : " + prixProduits.get(couleur));
        }

        for (Map.Entry<Couleur, Integer> entry : prixProduits.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "€");
        }
    }
}
