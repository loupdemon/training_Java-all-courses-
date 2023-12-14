import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("samuel");
        set.add("coucou");
        set.add("Hello");
        set.add("World");
        set.add("Hello");
        //aucun ordre et pas d'affichage doublon
        System.out.println(set);

        //affichage de la taille
        System.out.println("size");
        System.out.println(set.size());

        //verifier si la liste est vide
        System.out.println(set.contains("isEmpty"));
        System.out.println(set.isEmpty());

        //verifier si un element existe
        System.out.println("contains");
        System.out.println(set.contains("Hello"));

        //parcours de la liste
        for (String string : set) {
            System.out.println(string);
        }

        //suppression d'un element
        System.out.println("remove");
        set.remove("Hello");
        System.out.println(set);

        //une autre faççon de declarer une liste
        List<String> list = List.of("josue","bonjour","ça va","bonjour");
        System.out.println(list);

        List<String> list2 = Arrays.asList("Kamy","bonsoir","ça va","bonsoir");
        System.out.println(list2);

        Set<String> set2 = new HashSet<>(list2);
        System.out.println(set2);


        List<String> list3 = List.of("josue","bonjour","ça va","bonjour");

        List<String> list4 = Arrays.asList("Kamy","bonsoir","ça va","bonsoir");


        //Union et intersection et difference
        Set<String> set5 = new HashSet<>(list3);
        Set<String> set6 = new HashSet<>(list4);

        //union
        System.out.println("union");
        Set<String> union = Stream.concat(set5.stream(), set6.stream()).collect(Collectors.toSet());
        System.out.println(union);
        // ou avec addAll
        set5.addAll(set6);
        System.out.println(set5);



        //intersection
        System.out.println("intersection");
        Set<String> intersection = set5.stream().filter(set6::contains).collect(Collectors.toSet());
        System.out.println(intersection);
        //ou avec retains
        set5.retainAll(set6);
        System.out.println(set5);

        //difference
        System.out.println("difference");
        Set<String> difference = set5.stream().filter(e -> !set6.contains(e)).collect(Collectors.toSet());
        System.out.println(difference);
        //ou avec removeAll
        set5.removeAll(set6);
        System.out.println(set5);








    }
}