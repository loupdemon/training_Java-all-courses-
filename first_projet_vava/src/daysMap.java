import java.util.HashMap;

public class daysMap {
    public static void main(String[] args) {
        HashMap<Integer, String> jours = new HashMap<>();

        jours.put(1, "Lundi");
        jours.put(2, "Mardi");
        jours.put(3, "Mercredi");
        jours.put(4, "Jeudi");
        jours.put(5, "Vendredi");
        jours.put(6, "Samedi");
        jours.put(7, "Dimanche");

        System.out.println(jours.get(1)); // affiche Lundi
        jours.replace(5, "Friday");
        System.out.println(jours.get(5)); // affiche Friday
        jours.remove(2);
        System.out.println(jours); //affiche {1=Lundi, 3=Mercredi, 4=Jeudi, 5=Friday, //6=Samedi, 7=Dimanche}
    }

}
