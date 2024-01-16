package iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private List<T> items;
    private int size;
    private int currentIndex = 0;

    public ListIterator(List<T> items){
        this.items = items;
        this.size = items.size();
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < this.size;
    }

    @Override
    public T current() {
        return this.items.get(currentIndex);
    }  
}
