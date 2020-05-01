package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromAnArray7 {

    public static void main(String[] args) {

        Integer[] arr = {1, 1, 2, 2, 3, 3};//this is array
        ArrayList<Integer> nonDup = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!nonDup.contains(arr[i])) {
                nonDup.add(arr[i]);
            }
        }
        System.out.println(nonDup);
    }
}

