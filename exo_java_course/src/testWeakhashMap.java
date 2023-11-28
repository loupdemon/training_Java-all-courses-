import java.util.WeakHashMap;

public class testWeakhashMap {
    public static void main(String[] args) {

        WeakHashMap<String, String> infos = new WeakHashMap<>(); //info nom de structure

        String  nom = new String("Nom"); //creation premier index i
        String  nomValue = "Toto"; //attribution de valeur
        String  prenom = new String("Prenom"); // creation second index i
        String  prenomValue = "Tata";

        // insertion des éléments
        infos.put(nom, nomValue);
        infos.put(prenom, prenomValue);
        System.out.println("WeakHashMap: " + infos); //affiche WeakHashMap: {Prenom=Tata, Nom=Toto}

        // mettre la réfence à null
        nom = null; //vider et supprimer la clé

        // appel du garbage collector
        System.gc();

        System.out.println("WeakHashMap après le garbage collector: " +  infos); // affiche WeakHashMap après le //garbage collector: {Prenom=Tata}
        System.out.println("WeakHashMap: " + infos); //affiche WeakHashMap: {Prenom=Tata, Nom=Toto}

        /*
        lorsque la clé du weakhashmap est définie comme nulle et que l’on effectue un garbage collection, la clé est supprimée.
        C’est parce que, contrairement aux hashmaps, les clés des weakhashmaps sont de type référence faible. Cela signifie que
        les entrées d’une weakhashmap sont supprimées par le ramasse-miettes (garbage collector) si la clé de cette entrée
        n’est plus utilisée. Ceci est utile pour économiser des ressources.
         */


        /*
        si on changeait WeakHashmap par HashMap et on faisait nul et garbage collection le nom ne serait pa ssupprimé
        car les clés sont de type reference forte, même si ce type d erentrée n'est plus utilisé
        la clé ne sera pas suprimé par le ramasse miete
         */

    }

}
