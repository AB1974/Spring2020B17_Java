package daysmt_collectionsmuradil;

import java.util.LinkedList;
import java.util.List;

public class LinkedListexample {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(50);
        list.add(500);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.contains(50));

        list2.add(30);
        list2.add(40);
        list2.add(60);
        list2.add(60);

        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        System.out.println(list2.toString());
        list2.addFirst(1);
        list2.addLast(9999);



    }
}
