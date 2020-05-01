package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        System.out.println("===========INTERVIEW QUESTION=====================");
        /*
        Write a program that can move all the zeros to  last indexes of ArrayList
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declare  any extra lists
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0, 0, 0, 0, 0, 0, 0));
        System.out.println(list);

        int count = 0;
        for (Integer each : list) {
            if (each == 0) {
                count++;
            }
        }

        System.out.println(count);//count zero"s
            //[1,2,3,4]
        list.removeAll(Arrays.asList(0));//its going to remove all zeros

        System.out.println(list);
        //[1,2,3,4,0,0,0]
        for (int i = 0; i < count; i++) {//it should be depend on count!
            list.add(0);
            //list.add(0,0);if you want to add at the beginning
        }
        System.out.println(list);

    }
}
