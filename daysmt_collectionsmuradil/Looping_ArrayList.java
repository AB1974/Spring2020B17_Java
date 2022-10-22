package daysmt_collectionsmuradil;

import java.util.*;

public class Looping_ArrayList {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(543);
        nums.add(1150);
        nums.add(550);
        nums.add(570);
        nums.add(90);
        nums.add(5330);
        nums.add(1150);
        nums.add(55099);
        nums.add(950);

        //

        for (int n : nums) {

            System.out.print(n + " | ");
        }
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " | ");
        }
        System.out.println();
        //for Each method comes Iterable interface
        //we need to pass a lambda expression

        nums.forEach(n -> System.out.print(n + " | "));
        nums.removeIf(n->n<500);
        System.out.println();
        nums.forEach(n-> System.out.print(n+" | "));
        System.out.println();

         //  functional programing nums.stream() to manipulate data in collections.
        //functional programming is only for cleaner, shorter  programing
        //in general in java functional programming is slower than traditional loops
    }
}
