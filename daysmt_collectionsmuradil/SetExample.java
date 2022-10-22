package daysmt_collectionsmuradil;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> mySet=new HashSet<>();
        mySet.add(100);
        mySet.add(500);
        mySet.add(800);
        mySet.add(900);
        mySet.add(1000);
      //  mySet.add(1000);
    //    mySet.add(900);

        System.out.println(mySet.toString());

        System.out.println(mySet.size());
        List<String >list1=Arrays.asList("23","23","a","a","bb","jj","q","t","t");

        Set<String>unique=new HashSet<>(list1);
        System.out.println(unique.toString());
        //only unique ones retrieve automatically
        //[bb, jj, 23, a, q, t]

        TreeSet<Integer> tset=new TreeSet<>();
        tset.add(500);



    }
}
