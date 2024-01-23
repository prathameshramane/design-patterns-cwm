package iterator;

import java.util.*;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] items;
    private int currentIndex = 0;

    public ArrayIterator(T[] items) {
        this.items = items;
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public boolean isDone() {
        return currentIndex < items.length;
    }

    @Override
    public T current() {
        return items[currentIndex];
    }
    
    
}
