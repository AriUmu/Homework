package HWLesson16Collections;

import java.util.*;

class UseCollections {

    public static final int VALUE = 1_000_000;

    public static void main(String[] args) {

        List<A> linkedList = new LinkedList<>();
        long start;
        long finish;

        addTime(linkedList);
        sortTime(linkedList);
        binarySearchTime(linkedList);


        List<A> arrayList = new ArrayList<>();
        addTime(arrayList);
        sortTime(arrayList);
        binarySearchTime(arrayList);

        TreeSet<A> treeSet = new TreeSet<>();
        start = System.nanoTime();
        for (int i = 0; i < VALUE; i++) {
            treeSet.add(new A());
        }
        finish = System.nanoTime();
        System.out.println("Time add for treeSet " + (finish - start));

        start = System.nanoTime();
        A a = new A();
        boolean answer = treeSet.contains(a);
        finish = System.nanoTime();
        System.out.println("Does treeSet have a element " + a + " ? " + answer + "! Time: "  + (finish - start));

    }

    private static void binarySearchTime(List<A> list) {
        long start;
        long finish;
        start = System.nanoTime();
        int index = Collections.binarySearch(list, new A());
        list.get(index);
        finish = System.nanoTime();
        System.out.println("Element " + list.get(index) + " has number " + index);
        System.out.println("Time binarysearch " + list.getClass().getSimpleName() + " " + (finish - start));
        System.out.println();;
    }

    private static void addTime(List<A> list) {
        long start = System.nanoTime();
        for (int i = 0; i < VALUE; i++) {
            list.add(new A());
        }
        long finish = System.nanoTime();
        System.out.println("Time add " + list.getClass().getSimpleName() + " " + (finish - start));
    }

    private static void sortTime(List<A> list) {
        long start;
        long finish;
        start = System.nanoTime();
        Collections.sort(list);
        finish = System.nanoTime();
        System.out.println("Time sort of " + list.getClass().getSimpleName() + " " + (finish - start));
    }


}




public class A implements Comparable<A> {
    static Random r = new Random(55);

    int x=r.nextInt(100_000);

    @Override
    public String toString() {
        return Integer.toString(x);
    }

    @Override
    public int compareTo(A other) {
        //return x > o.x ? x : o.x;
        return x - other.x;
    }
}