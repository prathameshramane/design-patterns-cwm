package iterator;

public interface Iterator<T> {
    public void next();
    public boolean isDone();
    public T current();
}
