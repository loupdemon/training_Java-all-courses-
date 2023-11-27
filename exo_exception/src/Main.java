import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("PASS WORD!");
        //valider un mot de passe en respectant les conditions suivantes:
        //*minimum de taille 8
        //*contient des lettres minuscules et majuscule
        //*contient au minimum 2 nombre
        //*pour chaque cinditionnon respectée, lancez l'exception qui lui correcpond
        //->gerer les exceptions

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter your pd: ");
            String pd = scanner.nextLine();

            try {
                validatePd(pd);
                System.out.println("password validated");
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println(e.getMessage());
            }
        }


    }

    public static void validatePd(String pd) throws Exception{
        if (pd.length() < 8) {
            throw new Exception("password too short");
        }
        if (!pd.matches(".*[a-z].*")) {
            throw new Exception("password must contain at least one lowercase letter");
        }
        if (!pd.matches(".*[A-Z].*")) {
            throw new Exception("password must contain at least one uppercase letter");
        }
        if (!pd.matches(".*[0-9].*")) {
            throw new Exception("password must contain at least one number");
        }
        if(pd.replaceAll("\\D","").length()<2)
            throw new Exception("password must contain at least two numbers (digits)");
    }
}