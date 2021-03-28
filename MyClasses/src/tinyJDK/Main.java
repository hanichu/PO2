package tinyJDK;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArrayListFirst<Integer> test = new ArrayListFirst<>();
//        test.add(1);
//        test.remove(1);
//        System.out.println(test);

//        int[] container = {1,2,3};
//        int[] newone = new int[10];
//        container = Arrays.copyOf(container, container.length*2);
//        System.arraycopy(container, 2, container, 1,2);
//        System.out.println(Arrays.toString(container));
//        {
//            ArrayList<Integer> testRemove = new ArrayList<>();
//            testRemove.add(2);
//            testRemove.add(6);
//            testRemove.add(4);
//            testRemove.add(2);
//            testRemove.add(7);
//            testRemove.add(8);
//            testRemove.add(6);
//            testRemove.add(4);
//            testRemove.add(2);
//            testRemove.add(7);
//            System.out.println(testRemove);
//            testRemove.remove(2);
//            System.out.println(testRemove);
//            testRemove.add(63);
//            testRemove.add(43);
//            testRemove.add(23);
//            testRemove.add(73);
//            System.out.println(testRemove);
//        }

        {
            ArrayList<Integer> testGet = new ArrayList<>();
            testGet.add(2);
            testGet.add(6);
            testGet.add(4);
            testGet.add(2);
            testGet.add(7);
           // System.out.println(testGet.get(4));
            Iterator<Integer> it = testGet.iteratorOddPos();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

        }


    }
}
