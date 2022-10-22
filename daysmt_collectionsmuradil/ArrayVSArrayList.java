package daysmt_collectionsmuradil;

import java.util.*;

public class ArrayVSArrayList {
    public static void main(String[] args) {

        int[] numsArray = {30, 50, 5011, 30, 5, 5};

        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";


           List<Integer> numsList = new ArrayList<>();
      //  ArrayList<Integer> numsList=new ArrayList<>();

        numsList.add(44);
        numsList.add(44);
        numsList.add(101);

        System.out.println(numsArray[0]);
        System.out.println(numsList.get(0));

        System.out.println(Arrays.toString(numsArray));
        System.out.println(numsList.toString());


    }
}
