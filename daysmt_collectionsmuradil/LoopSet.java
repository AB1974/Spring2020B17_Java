package daysmt_collectionsmuradil;

import java.util.*;

public class LoopSet {
    public static void main(String[] args) {

        Set<Integer> numsSet = new TreeSet<>(Comparator.reverseOrder());//Set is unique ascending
        Set<Integer>numSet1=new TreeSet<>(Comparator.reverseOrder());//Set is unique descending
        numsSet.add(1);numsSet.add(2);numsSet.add(3);numsSet.add(7);
        numsSet.add(1770);numsSet.add(1077);numsSet.add(17);numsSet.add(177);

        System.out.println(numsSet.size());
        System.out.println(numsSet.toString());

        for (int n:numsSet){
            System.out.print(n+"| ");
        }
        System.out.println();

        System.out.println(numsSet);
    }
}
