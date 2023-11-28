import java.util.Scanner;

public class SwitchApp {
    // Utilisez un seul Scanner pour tout le programme
    private static Scanner scanner = new Scanner(System.in);
    // Prix des boissons
    private static double prixCoca = 2.5;
    private static double prixPepsi = 3.0;
    private static double prixFanta = 2.8;
    private static double prixSprite = 2.7;

    private static int limiteTentantveCode = 3;

    public static void main(String[] args) {
        System.out.println("Voici les boissons");
        combienFoisEcouterReponseVocale();
        choixBoisson();
    }

    // Les méthodes statiques peuvent être appelées par des méthodes statiques
    static void choixBoisson() {
        System.out.println("Quelle boisson veux-tu?");
        listBoisson();
        System.out.println("Fais un choix en entrant le chiffre");
        int boisson = scanner.nextInt();
        System.out.println("Vous avez saisi : " + boisson);

        switch (boisson) {
            case 1:
                System.out.println("Vous avez choisi Coca.");
                activerPromotion(prixCoca);
                break;
            case 2:
                System.out.println("Vous avez choisi Pepsi.");
                activerPromotion(prixPepsi);
                break;
            case 3:
                System.out.println("Vous avez choisi Fanta.");
                activerPromotion(prixFanta);
                break;
            case 4:
                System.out.println("Vous avez choisi Sprite.");
                activerPromotion(prixSprite);
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir un numéro de boisson valide.");
                choixBoisson();
        }
    }

    static void listBoisson() {
        System.out.println("1/ Coca - " + prixCoca + "€");
        System.out.println("2/ Pepsi - " + prixPepsi + "€");
        System.out.println("3/ Fanta - " + prixFanta + "€");
        System.out.println("4/ Sprite - " + prixSprite + "€");
    }

    static void combienFoisEcouterReponseVocale() {
        System.out.println("Combien de fois veux-tu écouter le guide vocal?");
        System.out.print("Veuillez entrer le nombre en chiffre : ");
        int userInput = scanner.nextInt();
        System.out.println("Vous avez saisi : " + userInput);
        repeterReponse(userInput);
    }

    static void activerPromotion(double prixBoisson) {
        System.out.println("Avez-vous un code-promo?");
        String reponse = scanner.next().toLowerCase();

        while (!reponse.equals("oui") && !reponse.equals("non")) {
            System.out.println("Nous n'avons pas compris votre réponse, répondez juste par Oui ou Non");
            reponse = scanner.next().toLowerCase();
        }
        boolean reponseOuiOuNon = reponse.equals("oui");
        if (reponseOuiOuNon) {
            // Valider le code promo avant le switch
            quellePromo(prixBoisson);
        }else System.out.println("vous n'allez pas bénéficier de réduction");


    }

    static void quellePromo( double prixBoisson){
        System.out.print("Veuillez entrer le code : ");
        String entreUser = scanner.next();
        System.out.println("Vous avez saisi : " + entreUser);
        limiteTentantveCode--;

        if (validerCodePromo(entreUser)) {
            double nouveauPrix;

            switch (entreUser) {
                case "abc1":
                    System.out.println("On activera la promotion forte");
                    nouveauPrix = activePromotionDuPrixFort(prixBoisson);
                    System.out.println("Voila ce que vous allez payer : " + nouveauPrix + "€");
                    break;
                case "def2":
                    System.out.println("On activera la promotion faible");
                    nouveauPrix = activePromotionDuPrixFaible(prixBoisson);
                    System.out.println("Voila ce que vous allez payer : " + nouveauPrix + "€");
                    break;
                default:
                    System.out.println("il reste"+ limiteTentantveCode);

                    if(limiteTentantveCode>0) {
                        System.out.println("Votre code ne fonctionne pas réessayez !");
                        System.out.println("Il vous reste "+limiteTentantveCode+" tentative");
                        //return;
                        quellePromo(prixBoisson);
                    }else System.out.println("vous avez épuisez toutes vos tentatives, reprenez de zéro");
            }
        } else {
            System.out.println("Le code promo n'est pas valide.");
            if(limiteTentantveCode>0) {
                System.out.println("Votre code doit avoir que 4 caractere!");
                System.out.println("Il vous reste "+limiteTentantveCode+" tentative");
                //return;
                quellePromo(prixBoisson);
            }else System.out.println("vous avez épuisez toutes vos tentatives, reprenez de zéro");
        }

    }

    static boolean validerCodePromo(String code) {
        return code.length() >= 4;
    }

    static void repeterReponse(int repeterChoix) {
        for (int i = 1; i <= repeterChoix; i++) {
            listBoisson();
            if (i < repeterChoix) {
                int nombreFoisQuiReste = repeterChoix - i;
                if (nombreFoisQuiReste == 1) {
                    System.out.print("Voici un dernier rappel de la liste des boissons");
                }
                System.out.println("Je vais répéter à nouveau la liste des boissons pour " + nombreFoisQuiReste + " fois. Veuillez bien écouter.");
            }
        }
    }

    static double activePromotionDuPrixFaible(double prix) {
        return prix * 0.75;
    }

    static double activePromotionDuPrixFort(double prix) {
        return prix * 0.5;
    }

}
