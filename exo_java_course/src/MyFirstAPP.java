//une classe commence toujours par majuscule et contient le nom du fichier
//pour définrir une classe il faut un modificateur d'accès le x(public ou private ...) + class + Nom
public class MyFirstAPP {
     //la méthode rend les opration connecté, dans d'autres language appeler procedures ou exécussion
    //public rend la classe ouverte et accessible par d'autre code
    //public =/= Public  static = montre que l'objet appartient à class et no à l'objet crée par la classe
    //voici la méthodee main, on peut exécuter la methode de n'importe quel endroit different
    public static void main(String[] arg){ //un tableau , args nom de la liste

        //First_code Branch

        //System.out.println("Hello World");// system : une class integré dans java, out champs pour montrer une sortie, println sur ecran sur une seule ligne //

        short puissance = 362;
        short emissionCo2 = 333;
        short cylindree = 6714;
        short place = 5;
        int prix = 36000;
        int kilometrage = 10800;

        long numeromatriculation = 123456789L;

        float consommatonRoute = 15.5F;
        float consommationVille = 13.6F;

        double consommationMoyenne = 151.564789123-1;

        boolean estEndomagee = true;

        char classEnergeique ='F';

        System.out.println("dodge Challenger SRT");
        System.out.println("Prix : $" + prix+" Immatriculation" + numeromatriculation);


        System.out.println("Conversion");
        System.out.println("NvKilometrage" + kilometrage); //elargissement
        int nvKilometrage = place;
        System.out.println("le kilometrage nouveau" + nvKilometrage);
        byte nvPrix=(byte)prix;
        System.out.println("le prix nouveau" + nvPrix); //retricissement errro car trop grand
    }
}