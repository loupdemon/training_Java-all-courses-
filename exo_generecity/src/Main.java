// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IGenericSet<Double> mySet = new GenericSet<>(5);

        mySet.add(1.0);
        mySet.add(2.2);
        mySet.add(3.4);
        mySet.add(4.8);
        mySet.add(5.2);
        mySet.add(6.8);
        mySet.add(7.3);
        mySet.add(8.1);

        System.out.println(mySet.getSize());
        mySet.print();

        System.out.println(mySet.contains(1.0));
        mySet.remove(1.0);
        System.out.println(mySet.contains(1.0));
        mySet.print();
        mySet.getSize();

        mySet.clear();
        System.out.println(mySet.contains(2.2));
        mySet.remove(2.2);
        mySet.print();
        mySet.getSize();
        System.out.println(mySet.contains(2.2));
    }
}