import java.util.*;

public class testTreemap {
    public static void main(String[] args) {
        // Création d'une TreeMap avec des clés de type String (noms) et des valeurs de type Integer (âges)
        TreeMap<String, Integer> ages = new TreeMap<>();

        // Ajout de quelques données à la TreeMap
        ages.put("Alice", 25);
        ages.put("Bob", 30);

        ages.put("David", 35);
        ages.put("Charlie", 22);

        // Affichage des âges triés par ordre alphabétique des noms
        System.out.println("Ages triés par ordre alphabétique des noms : ");
        afficherAges(ages);

        // Modification de l'âge de Bob
        ages.put("Bob", 32);

        // Affichage des âges mis à jour
        System.out.println("\nAges mis à jour triés par ordre alphabétique des noms : ");
        afficherAges(ages);
    }

    // Méthode pour afficher les âges triés par ordre alphabétique des noms
    private static void afficherAges(TreeMap<String, Integer> ages) {
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " ans");
        }
    }
}
