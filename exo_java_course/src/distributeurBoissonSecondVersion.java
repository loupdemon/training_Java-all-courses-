import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class distributeurBoissonSecondVersion {
        private static Scanner scanner = new Scanner(System.in);

        // Prix des boissons
        private static Map<String, Double> prixDesBoissons = new HashMap<>(); //renvoie à la premier valeur coca et double au prix

        static {
            prixDesBoissons.put("coca", 2.5);
            prixDesBoissons.put("pepsi", 3.0);
            prixDesBoissons.put("fanta", 2.8);
            prixDesBoissons.put("sprite", 2.7);
        }

        public static void main(String[] args) {
            choixBoisson();
        }

        static void choixBoisson() {
            System.out.println("Quelle boisson veux-tu?");
            listBoisson();
            System.out.print("Veuillez entrer le nom de la boisson : ");
            String choixBoisson = scanner.next().toLowerCase();

            if (prixDesBoissons.containsKey(choixBoisson)) {
                System.out.println("Vous avez choisi " + choixBoisson + ".");
                activerPromotion(choixBoisson);
            } else {
                System.out.println("Choix invalide. Veuillez choisir une boisson valide.");
                choixBoisson();
            }
        }

        static void listBoisson() {
            for (Map.Entry<String, Double> entry : prixDesBoissons.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + "€");
            }
            System.out.println("-------------------------------------------");
            System.out.println("boissons: " +prixDesBoissons.keySet()); // façon d'affiche la premiere colonne autrement en liste boissons: [coca, pepsi, sprite, fanta]
            System.out.println("price: " +prixDesBoissons.values());//affiche les prix , seconde colonne price: [2.5, 3.0, 2.7, 2.8]
            System.out.println("données :" +prixDesBoissons.entrySet());//afficher toute la strucutre le tableau de deux dimension données :[coca=2.5, pepsi=3.0, sprite=2.7, fanta=2.8]
        }

        static void activerPromotion(String boissonChoisie) {
            System.out.println("Avez-vous un code-promo pour " + boissonChoisie + "?");
            String reponse = scanner.next().toLowerCase();
            boolean reponseOuiOuNon = reponse.equals("oui");

            if (reponseOuiOuNon) {
                System.out.print("Veuillez entrer le code : ");
                String entreUser = scanner.next();
                System.out.println("Vous avez saisi : " + entreUser);

                if (validerCodePromo(entreUser)) {
                    double prixBoisson = prixDesBoissons.get(boissonChoisie);

                    // Appliquer la promotion sur la boisson choisie
                    double nouveauPrix = appliquerPromotion(prixBoisson);
                    System.out.println("Le nouveau prix avec la promotion est : " + nouveauPrix + "€");
                } else {
                    System.out.println("Le code promo n'est pas valide.");
                }
            }
        }

        static boolean validerCodePromo(String code) {
            return code.length() >= 4;
        }

        static double appliquerPromotion(double prix) {
            return prix * 0.75; // Promotion de 25%
        }
    }
