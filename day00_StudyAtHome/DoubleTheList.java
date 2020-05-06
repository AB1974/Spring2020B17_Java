package day00_StudyAtHome;

import java.util.*;


public class DoubleTheList {




    /**
     * Write a method
     * name;double the list
     * return type List<Integer>
     * params:List<Integer>
     * It will double the values of each element return it
     * doubleTheList=[3,5,7]==>[6,10,14]
     * do not create another list
     */

    public static ArrayList<Integer> doubleTheList(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size(); i++) {

            nums.set(i, nums.get(i) * 2);

        }
        return nums;

    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(5,4,10));


        System.out.println(doubleTheList(myList));

    }

}
