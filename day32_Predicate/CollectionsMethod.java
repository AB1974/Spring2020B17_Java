package day32_Predicate;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */

        System.out.println("========Collections.max()=========================");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4));
        // second max: 3

        Integer maxNum = Collections.max(numbers);  //4

        numbers.removeAll(Arrays.asList(maxNum));

        System.out.println(numbers);


        int secondMax = Collections.max(numbers);

        System.out.println(secondMax);

        System.out.println("===========Collections.min()=============================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8));
        Integer minNum = Collections.min(list2); //1

        list2.removeAll(Arrays.asList(minNum));  // removes all the minimum number
        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);
        System.out.println("=============Collections.swap()===========================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //swap//                                                  0           4

        System.out.println(list3);//12345
        Collections.swap(list3, 0, 4);//swaps the elements at the given indexes from LEFT==>RIGHT

        System.out.println(list3);//5,2,3,4,1
        System.out.println("=============Collections.replaceAll()===========================");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 4, 5));
        System.out.println(list4);//1,1,1,2,3,4,5

        Collections.replaceAll(list4, 1, 10);
        System.out.println(list4);//10,10,10,2,3,4,5


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));
        //Omer to Irina

        /*
        names.set(0, "Irina");
        names.set(1, "Irina");
        names.set(5, "Irina");
        System.out.println(names);
       */

        Collections.replaceAll(names,"Omer","Irina");
        System.out.println(names);
    }
}
