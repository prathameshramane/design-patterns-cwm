package iterator;

import java.util.*;

public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastUrl;
    }

    public Iterator<String> createIterator() {
        // returns nested class implementation
        return new ListIterator(this);
    }

    // Alternate approach for accessing private fields in class
    // Knows how to iterator over BrowserHistory
    // Current code implementation uses this class
    class ListIterator implements Iterator<String> {
        private BrowserHistory history;
        private int size;
        private int currentIndex = 0;
    
        public ListIterator(BrowserHistory history){
            this.history = history;
            this.size = history.urls.size();
        }
    
        @Override
        public void next() {
            currentIndex++;
        }
    
        @Override
        public boolean isDone() {
            return this.currentIndex < this.size;
        }
    
        @Override
        public String current() {
            return this.history.urls.get(currentIndex);
        }  
    }
}
