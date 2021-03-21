package tinyJDK;

public interface List<T> extends Collection<T> {
    boolean add(T x);
    boolean contains(T x);
    int size();
    boolean remove(T x);
    T get(int index) throws OutOfBoundException;
}
