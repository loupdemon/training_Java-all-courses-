public class GenericListComparable <T extends Comparable>{
//T is a type parameter
    //E is elemnt

    private T[] items = (T[]) new Comparable[5]; // taleau d'entier
    //on crée un tableau objet et puis convertir en tableau de type T

    private int count; // nombre d'éléments dans le tableau

    //rajoute une spécification
    // @param item : l'élément à ajouter
    // @return void
    // @throws ArrayIndexOutOfBoundsException si le tableau est plein
    // @throws IllegalArgumentException si l'élément est négatif
    // @throws NullPointerException si l'élément est null
    // @throws Exception si l'élément est null

    public void add(T item) {
        items[count++] = item;
    }

    // @param index : l'index de l'élément à récupérer
    // @return l'élément à l'index spécifié
    // @throws ArrayIndexOutOfBoundsException si l'index est hors des limites du tableau
    // @throws IllegalArgumentException si l'index est négatif
    // @throws NullPointerException si l'index est null
    // @throws Exception si l'index est null

    public T get(int index) {
        return items[index];
    }
}
