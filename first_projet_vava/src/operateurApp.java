/**
 * Description <b>pour tester les differents opérateur avec prix voiture t budget</b>
 *
 * @tag1
 * @tag2
 */
public class operateurApp {
    public static void main(String[] args) {

        String typeVoiture = "Mercedes S";
        int prix = 40000;
        int budget = 50000;
        boolean estEndomagee = true;

        System.out.println("prix : $" + prix);
        int augmentationPrix = prix+1000;
        System.out.println("prix augmenté: £" +augmentationPrix);
        int diminutionPrix = prix -1000;
        System.out.println("prix : £ "+diminutionPrix);
        int aumentationDouble = prix*2;
        System.out.println("prix augmente : £"+aumentationDouble);
        int moitierPrix = prix /2;
        System.out.println("prix dimminué : $" + moitierPrix);
        int achatNombreVoiture = budget%prix;
        System.out.println("vous pouvez acheter ce nombre de mercedes"+achatNombreVoiture);
        int argentQuiResteBudget =  budget%prix;
        System.out.println("il vous restera : £" +argentQuiResteBudget);
        int newPrix = prix;
        int tour=0;
        for(int nombreJour=0;nombreJour<10;nombreJour++, tour++){
            System.out.println(tour +"tours" + "valeurs prix" + newPrix);
            newPrix--;
            System.out.println(tour +"tours" + "valeurs prix" + newPrix);

        }
        System.out.println("le nouveau prix " + newPrix);

        System.out.println("le prix de la voiture est plus grand que mon budget" + (prix> budget));
        System.out.println("le prix de la voiture est inferieur ou egale àmon budget" + (prix<= budget));


        String textEndomagee = estEndomagee ? "la voiture est endommagé" : "la voiture n'est pas endomagée";
        //avec negation
        String mentirsurdommage = !estEndomagee ? "la voiture est endommagé" : "la voiture n'est pas endomagée";

        System.out.println(textEndomagee);
        System.out.println(mentirsurdommage);

        String vautLapeineDeVoir = !estEndomagee || prix <20000 ? "ça vaut la peine de voir" : "la voiture est endommagé ou pas interessant pour le prix";
        System.out.println(vautLapeineDeVoir);



    }
}
