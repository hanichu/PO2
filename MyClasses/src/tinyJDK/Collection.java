package tinyJDK;

public interface Collection<T> extends Iterable<T> {
    boolean add(T x);
    boolean contains(T x);
    int size();
    boolean remove(T x);
}
