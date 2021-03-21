package it.unive.dais.po2.aa2020_21.tinyjdk;

public interface List<T> extends Collection<T> {
    void add(T x);
    boolean contains(T x);
    int size();
    void remove(T x);
}
