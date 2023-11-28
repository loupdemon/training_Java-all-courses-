public class Utils  {
    public static int min(int a, int b) {
        return (a < b) ? a : b; // si a < b alors return a sinon return b
    }
    public static <T extends Comparable<T>> T minObj(T c, T d) {
        return (c.compareTo(d) < 0) ? c : d; // si a < b alors return a sinon return b
    }



}
