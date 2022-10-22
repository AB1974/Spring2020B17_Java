package MixedEveryting;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};//sie is 5 index is 4
        System.out.println(arr.length);
        int arr1[] = new int[5];
        System.out.println(arr1.length);
        boolean[] arr2 = {true, false, true};
        System.out.println(!arr2[1]);//true

        int array[] = new int[5];
        System.out.println(Arrays.toString(array));
        array[0] = 10;
        array[1] = 20;
        array[2] = 20;
        array[3] = 30;
        array[4] = 40;

        for (int i = 0; i < array.length; i++) {

            System.out.println("Element for index " + i + " is " + array[i]);
        }
        System.out.println("===============");
                        //             0 ,1,2                       0,1,2
        String[][] twoDarray = {{"Mr.", "Mrs.", "Ms."}, {"Zuura", "Sue", "Barzy"}};
        //                          0                           1
        System.out.println(twoDarray[0][0]+twoDarray[1][2]);
        System.out.println(twoDarray[0][1]+twoDarray[1][0]);
        System.out.println(Arrays.deepToString(twoDarray));

    }


}
