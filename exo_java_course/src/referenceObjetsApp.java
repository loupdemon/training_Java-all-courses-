import java.sql.SQLOutput;

public class referenceObjetsApp {
    public static void main(String[] arg){

        //creer un des chaques type d'objet qui a version primitifs
        Byte nombrePlace = 5;
        Short puissance = 365;
        Integer prix = 36000;
        Long immatriculation = 5641254799L;
        Double  consommationVillee = 151.564789123;
        Float consomationmoyenne = 15.5F;
        Boolean estEndomage = true;
        Character classeEnergetique = 'F';
        String typeVoiture = "Dodge Defile";
        String typeVoitureAvecVue = new String ("Dodg challenger");


        System.out.println("prix: " + prix.floatValue()); //renvoyer avec valeur flottente le int
        System.out.println("consommation moyenne" + consomationmoyenne.intValue());

        System.out.println("type voiture" + typeVoiture.toUpperCase());
        System.out.println("Type voiture Vue " + typeVoitureAvecVue.toLowerCase());

        System.out.println("le type de voiture sont ils pareil : " + typeVoiture.equals(typeVoitureAvecVue));
    }
}
