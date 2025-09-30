package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class RandomAccessDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Fill both lists with 1,000,000 numbers
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get((int) (Math.random() * 1000000));
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList random access time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get((int) (Math.random() * 1000000));
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList random access time: " + (end - start) + " ms");
    }
}
