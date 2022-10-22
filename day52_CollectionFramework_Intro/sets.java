package day52_CollectionFramework_Intro;

import java.util.*;

public class sets {
    public static void main(String[] args) {

        //Set(I) is interface
        //does not accept duplicates
        //does not have index Number
        Set<String> set1 = new HashSet<>();//It does not accept duplicate!
        set1.add("Sha");
        set1.add("Zuura");
        set1.add("Saban");
        set1.add("Ozgur");
        set1.add("Ozgur");
        set1.add("Ozgur");
        set1.add("Ozgur");

        System.out.println(set1);
        System.out.println("=============");


        System.out.println("===================================================");
        Set<String> set2 = new LinkedHashSet<>();//It does not accept duplicate!
        //keeps the insertion order as it is.
        set2.add("Sha");
        set2.add("Zuura");
        set2.add("Saban");
        set2.add("Ozgur");
        set2.add("Ozgur");
        set2.add("Ozgur");
        set2.add("Ozgur");

        System.out.println(set2);
        System.out.println("===========================");
        String[] arr = {"a", "a", "c", "b", "a"};//remove duplicates
        //set does not remove duplicates
        //if you want to keep the insertion order as it is use LinkedHashSet
        LinkedHashSet<String> set3 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set3);
        //  System.out.println(set1.get(1));no index no
        System.out.println("======");
        //HasSEt is faster than LinkedHashSet!
        //HasSet does not keep inserted order
        HashSet<String> set4 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set4);//does not keep inserted order!


        System.out.println("===============");

        Set<Integer> num = new TreeSet<>();
        //does not accept null
        num.addAll(Arrays.asList(10, 9, 5, 7, 8, 3, 3, 6, 5, 6, 7));
        //first removes duplicates
        //second sorts it
        System.out.println(num);

        System.out.println("===null means no object =====");

        TreeSet<String> treeset = new TreeSet<>();
        //  treeset.add(null);does not allow null but hashset it allows null
        System.out.println(treeset);
        HashSet<String> treeset1 = new HashSet<>();
        treeset1.add(null);//does allow
        System.out.println(treeset1);

        //Hashset faster than Treeset !
    }
}
