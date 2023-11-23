import java.util.Map;
import java.util.HashMap;

public class mapUtilisation
{

    public static void main(String[] args) {
        Map<String, String> langues = new HashMap<>();

        langues.put("FR", "Français");
        langues.put("EN", "Anglais");
        langues.put("ES", "Espagnol");

        // Affiche les clés du map
        System.out.println("Clés: " + langues.keySet());

        // Affiche les valeurs du map
        System.out.println("Values: " + langues.values());

        // Affiche les entrées du map
        System.out.println("Entrées: " + langues.entrySet());
    }
}
