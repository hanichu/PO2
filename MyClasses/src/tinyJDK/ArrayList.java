package tinyJDK;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

    private Object[] container = new Object[10];
    int size = 0;

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            int pos = 0;
            @Override
            public boolean hasNext() {
                return pos < size();
            }

            @Override
            public T next() {
                return get(pos++);
            }
        };
    }

    public Iterator<T> iteratorOddPos() {

        return new Iterator<T>() {
            int pos = 1;
            @Override
            public boolean hasNext() {
                return pos < size();
            }

            @Override
            public T next() {
                T x = get(pos);
                pos += 2;
                return x;
            }
        };
    }

    @Override
    public boolean add(T x) {
        if(size >= container.length){
            container = Arrays.copyOf(container, container.length*2);
        }
        container[size++] = x;
        return true;
    }

    @Override
    public int contains(T x) {
        for (int i = 0; i < size; i++) {
            if(container[i].equals(x)) return i;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(T x) {
        int pos = contains(x);
        if(pos>=0){
            System.arraycopy(container, pos+1, container, pos, size()-pos-1);
            container[--size] = null;
            return true;
        }
        return false;
    }

    @Override
    public T get(int index){
        if(index>=size) throw new RuntimeException("Index too big");
        return (T) container[index];
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "container=" + Arrays.toString(container) +
                ", size=" + size() +
                '}';
    }
}
