import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testTreeMapAge {
    public static void main(String[] args) {
        // Création d'une liste de personnes avec des noms et des âges
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("David", 35));
        personnes.add(new Personne("Alice", 25));
        personnes.add(new Personne("Charlie", 22));
        personnes.add(new Personne("Bob", 30));


        // Tri de la liste par ordre alphabétique des noms
        Collections.sort(personnes, Comparator.comparing(Personne::getNom));

        // Affichage des personnes triées par ordre alphabétique des noms
        System.out.println("Personnes triées par ordre alphabétique des noms : ");
        afficherPersonnes(personnes);

        // Tri de la liste par ordre croissant des âges
        Collections.sort(personnes, Comparator.comparingInt(Personne::getAge));

        // Affichage des personnes triées par ordre croissant des âges
        System.out.println("\nPersonnes triées par ordre croissant des âges : ");
        afficherPersonnes(personnes);

        //pour faire decroissant
        Collections.sort(personnes, Comparator.comparingInt(Personne::getAge).reversed());
        afficherPersonnes(personnes);


    }

    // Méthode pour afficher les personnes
    private static void afficherPersonnes(List<Personne> personnes) {
        for (Personne personne : personnes) {
            System.out.println(personne.getNom() + " : " + personne.getAge() + " ans");
        }
    }

    // Classe Personne pour représenter une personne avec un nom et un âge
    static class Personne {
        private String nom;
        private int age;

        public Personne(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }

        public String getNom() {
            return nom;
        }

        public int getAge() {
            return age;
        }
    }
}
