import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {
        choixBoisson();
        combienFoisEcouterReponseVocale();
        activerPromotion();
    }



    // les méthodes statiques peuvent être appelées par des méthodes statiques
    static void choixBoisson() {
        System.out.println("QUELLE choix de boisson veux-tu?");
    }



    static void listBoisson() {
        System.out.println("1/ coca");
        System.out.println("2/ pepsi");
        System.out.println("3/ fanta");
        System.out.println("4/ sprite");
    }




    static void combienFoisEcouterReponseVocale() {
        // Créer un objet Scanner pour lire l'entrée de la console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien de fois veux-tu écouter le guide vocal?");

        // Demander à l'utilisateur d'entrer quelque chose
        System.out.print("Veuillez entrer le nombre en chiffre : ");

        // Lire l'entrée de l'utilisateur
        int userInput = scanner.nextInt();  // Utilisez nextInt() pour lire un entier

        // Afficher ce que l'utilisateur a saisi
        System.out.println("Vous avez saisi : " + userInput);

        // Fermer le scanner pour éviter les fuites de ressources
        repeterReponse(userInput);
        scanner.close();
    }

    static void activerPromotion() {
        // Créer un objet Scanner pour lire l'entrée de la console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Avez-vous un code-promo?");
        //boolean reponseOuiOuNon = scanner.nextBoolean(); // lire un boolean
        //boolean reponseOuiOuNon = Boolean.parseBoolean(scanner.next());

        String reponse = scanner.next().toLowerCase();
        boolean reponseOuiOuNon = reponse.equals("oui");


        if (reponseOuiOuNon) {
            // Demander à l'utilisateur d'entrer quelque chose
            System.out.print("Veuillez entrer le code : ");
            String entreUser = scanner.next(); // Utilisez next() pour lire une chaîne

            // Afficher ce que l'utilisateur a saisi
            System.out.println("Vous avez saisi : " + entreUser);

            // Valider le code promo (par exemple, vérifier la longueur minimale)
            if (validerCodePromo(entreUser)) {
                switch (entreUser.toLowerCase()) {
                    case "abc1":
                        System.out.println("On activera la promotion forte");
                        break;

                    case "def2":
                        System.out.println("On activera la promotion moyenne");
                        break;

                    default:
                        System.out.println("Votre code ne fonctionne pas");
                }
            } else {
                System.out.println("Le code promo n'est pas valide.");
            }
        }

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();
    }

    static boolean validerCodePromo(String code) {
        // Ajoutez ici votre logique de validation du code promo
        // Par exemple, vérifiez la longueur minimale ou d'autres critères
        return code.length() >= 4; // Exemple : Le code doit avoir une longueur minimale de 4 caractères
    }

    static void repeterReponse(int repeterChoix) {
        for (int i = 1; i <= repeterChoix; i++) {
            listBoisson();
            if(i<repeterChoix){
                int nombreFoisQuiReste = repeterChoix -i;
                if(nombreFoisQuiReste ==1){
                    System.out.print("Voici un dernier rappel de la liste des boissons");

                }
                System.out.println("je vais repeter à nouveau la liste des boissons pour" + nombreFoisQuiReste+ " fois  veuillez bien écouter ");

            }
        }
    }






    static double getPromotionDuPrixMoyen(int prix){
        return prix *0.75;
    }

    static double getPromotionDuPrixFort(int prix){
        return prix *0.5;
    }


}
