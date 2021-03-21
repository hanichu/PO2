package tinyJDK;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

    private Object[] container = new Object[0];

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    @Override
    public boolean add(T x) {
        int clength = container.length;
        Object[] newContainer = new Object[clength+1];
        for (int i=0; i < clength; i++){
            newContainer[i] = container[i];
        }
        newContainer[clength] = x;
        container = newContainer;
        return true;
    }

    @Override
    public boolean contains(T x) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean remove(T x) {
        int clength = container.length;
        for (int i=0; i < clength; i++){
            if(container[i].equals(x)){
                Object[] newContainer = new Object[clength-1];
                for (int j = 0, z = 0; j < newContainer.length; ++j, ++z){
                    if(z==i){
                        ++z;
                        newContainer[j] = container[z];
                    }else{
                        newContainer[j] = container[z];
                    }
                }
                container=newContainer;
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "container=" + Arrays.toString(container) +
                '}';
    }
}
