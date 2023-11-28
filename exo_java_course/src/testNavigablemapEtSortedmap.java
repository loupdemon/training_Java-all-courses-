
import java.util.*;

public class testNavigablemapEtSortedmap  {
    public static void main(String[] args) {
        // Création d'une TreeMap, qui implémente à la fois SortedMap et NavigableMap
        NavigableMap<String, Integer> ages = new TreeMap<>();

        // Ajout de quelques données à la TreeMap
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 22);
        ages.put("David", 35);

        // Affichage des âges triés par ordre naturel des clés (noms)
        System.out.println("Ages triés par ordre naturel des noms : ");
        afficherAges(ages);

        // Utilisation de méthodes spécifiques à NavigableMap
        System.out.println("\nInformations spécifiques à NavigableMap : ");
        afficherNavigableMapInformations(ages);

        // Utilisation de sous-map pour afficher les âges entre "Bob" et "David" inclus
        System.out.println("\nAges entre Bob et David inclus : ");
        NavigableMap<String, Integer> sousMap = ages.subMap("Bob", true, "David", true);
        afficherAges(sousMap);
    }

    // Méthode pour afficher les âges
    private static void afficherAges(Map<String, Integer> ages) {
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " ans");
        }
    }

    // Méthode pour afficher des informations spécifiques à NavigableMap
    private static void afficherNavigableMapInformations(NavigableMap<String, Integer> ages) {
        System.out.println("Premier élément : " + ages.firstEntry());
        System.out.println("Dernier élément : " + ages.lastEntry());
        System.out.println("Element précédant 'Charlie' : " + ages.lowerEntry("Charlie"));
        System.out.println("Element suivant 'Charlie' : " + ages.higherEntry("Charlie"));
    }
}
