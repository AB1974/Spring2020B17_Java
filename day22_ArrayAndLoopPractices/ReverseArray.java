package day22_ArrayAndLoopPractices;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        /*
         1. write a program that can reverse the array
         */

        int [] arr={1,2,3,4,5};

            for (int i = arr.length - 1; i >= 0; i--) {

                int eachNum=arr[i];
                System.out.println(eachNum);

            }
        System.out.println("==============");

        int[] RevArr = new int[arr.length];

        int lastIndex = arr.length - 1;//

        for (int i = 0; i < arr.length; i++) {

            RevArr[i] = arr[lastIndex];//first step like RevArr[0]=arr[4] first index=last index
            lastIndex--;
        }

        System.out.println(Arrays.toString(RevArr));

        System.out.println("=================");

        int[] revArr = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1-i];
        }
        System.out.println(Arrays.toString(revArr));

        System.out.println("=========================");


    }
}
