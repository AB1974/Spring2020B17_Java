package day53_Iterable_Maps;

import MixedEveryting.Array;
import OfficeHours.Practice_04_29_2020.ArrayList_Methods;

import java.util.*;

public class Collection_Practice {

    /*
    access-modifier,specifier,return-type,methodsName(Parameter)
    specifiers:static final abstract,synchronized
    Collections is utility class
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));//this is not synchronized
        list = Collections.synchronizedList(list);//it's synchronized NOW//now is thread safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set);//thread safe

        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};//do not change the order
        LinkedHashSet<String> st = new LinkedHashSet<>(Arrays.asList(arr));//keeps insertion order//E,B,A,D,C
        System.out.println(st);
/*
        for (String each : arr) {
            st.add(each);
        }
*/
        TreeSet<String> st1 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(st1);//A,B,C,D,E

        ArrayList<String> arraylist = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(arraylist);
        System.out.println(st2);


    }


    public synchronized void append() {//Vector is synchronized

    }
}
