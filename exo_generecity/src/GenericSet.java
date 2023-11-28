import java.util.Arrays;
import java.util.Objects;

public class GenericSet<T> implements IGenericSet<T> {
    private int length;
    private T[] items; //tableau
    private int count; //compteur
    public GenericSet(int length) {
        this.length = length;
        this.items = (T[]) new Object[length];
    }

    @Override
    public void add(T item) {
//        if (this.count < this.length) {
//            this.elements[this.count] = element;
//            this.count++;
//        }
//        for (var tmpItem : this.elements) {
//            if (tmpItem.equals(element)) { //là on pouvait pas mettre this.element ==tempItem , car sion on serait entrain de meme adress=adress ce qu isera tjrs vrai dans ce cas
//                return;
//            }
        for(var tmpItem : items)
            if (Objects.equals(tmpItem,item)){
                return;
            }
        if(count < length){
            items[count] = item;
            count++;
        }
//        else{
//            var newItems = new T[items.length * 2];
//            for (int i = 0; i < items.length; i++) {
//                newItems[i] = items[i];
//            }
//            newItems[count] = item;
//            count++;
//            items = newItems;
//        }
    }

    @Override
    public void remove(T item) {
        for (int i = 0; i < length; i++) {
            if(Objects.equals(items[i],item)){
                int tmp = i;
                while (tmp < count - 1){
                    items[tmp] = items[tmp + 1];
                    tmp++;
                 }
                items[tmp] = null;
                count--;
            }
        }
    }

@Override
public boolean contains(T element) {
    for (var tmpItem : this.items) {
        if (Objects.equals(tmpItem, element)) {
            return true;
        }
    }
    return false;
}

    @Override
    public T get(int index) {
        if (index < 0 || index >= this.count) {
            throw new IndexOutOfBoundsException();
        }
        return this.items[index];
    }

    @Override
    public void clear() {
        this.items = (T[]) new Object[this.length];
    }

    @Override
    public int getSize() {
        return this.count;
    }


    @Override
    public void print() {
//        for (int i = 0; i < this.count; i++) {
//            System.out.println(this.elements[i]);
//        }
        System.out.println(Arrays.toString(this.items));
    }


}