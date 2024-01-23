package iterator;

class Main {
    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.push("url-1");
        bh.push("url-2");
        bh.push("url-3");

        Iterator<String> it = bh.createIterator();
        while(it.isDone()){
            System.out.println(it.current());
            it.next();
        }
    }
}