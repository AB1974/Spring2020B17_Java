package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArrayList6 {
    //remove duplicates please //expected result
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3,4,4));////1,2,3

        ArrayList<Integer> nonDup = new ArrayList<>();

        for (Integer each : list) {


            if (!nonDup.contains(each)) {//this expression is true for the first time
                //nonDup does not contain 1
                //nonDup
                nonDup.add(each);//true ise ekliyor!zaten varsa eklemiyor.
                //After first execution 1 will be added to the nonDup(because true)
                //After second execution 1 will not be added to the nonDup(because false)//1
                //After first execution 2 will be added to the nonDup(because true)
                //After second execution 2 will not be added to the nonDup(because false)//1,2
                //After first execution 3 will be added to the nonDup(because true)
                //After second execution 3 will not be added to the nonDup(because false)//1,2,3
            }
        }
        System.out.println(nonDup);
        //remove the duplicates from an array
    }
}
