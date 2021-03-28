package tinyJDK;

public interface Collection<T> extends Iterable<T> {
    boolean add(T x);
    int contains(T x);
    int size();
    boolean remove(T x);
}
