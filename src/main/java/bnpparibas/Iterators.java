package bnpparibas;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> itr = integers.iterator();

        while (itr.hasNext()) {
            Integer a = itr.next();
            integers.remove(a);
        }
    }
}
