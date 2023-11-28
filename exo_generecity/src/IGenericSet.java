// Fichier IGenericSet.java
public interface IGenericSet<T> {
    void add(T item);
    void remove(T item);
    T get(int index);
    boolean contains(T item);
    void clear();
    int getSize();
    void print();
}