public class List {
    private Object[] items = new Object[5]; // taleau d'entier
    private int count; // nombre d'éléments dans le tableau


    //rajoute une spécification
    // @param item : l'élément à ajouter
    // @return void
    // @throws ArrayIndexOutOfBoundsException si le tableau est plein
    // @throws IllegalArgumentException si l'élément est négatif
    // @throws NullPointerException si l'élément est null
    // @throws Exception si l'élément est null

    public void add(Object item) {
        items[count++] = item;
    }


    // @param index : l'index de l'élément à récupérer
    // @return l'élément à l'index spécifié
    // @throws ArrayIndexOutOfBoundsException si l'index est hors des limites du tableau
    // @throws IllegalArgumentException si l'index est négatif
    // @throws NullPointerException si l'index est null
    // @throws Exception si l'index est null

    public Object get(int index) {
        return items[index];
    }


}
