
public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        var iterator = list.iterator();

        iterator.hasNext();//pour verifier si il y a un element suivant
        iterator.next(); //pour retourner l'element actuel etpasser à l'element suivant
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (var item : list) {
            System.out.println(item);
        }
    }
}