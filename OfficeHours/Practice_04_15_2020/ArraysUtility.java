package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

    /*
        Arrays.sort();//sorts the array in ascending orders
        Arrays.toString();//checking equality of two arrays
        Arrays.equals(arr1,arr2);//arr1==arr2
        Arrays.deepToString();//any multidimensional array
        */


    int [] numbers ={4,6,7,100,1};

    Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] salaries ={12,360000,100000,15000000};
        int length=salaries.length;
        int lastIndex=length-1;

        Arrays.sort(salaries);
        System.out.println("Minimum salary : "+salaries[0]);
        System.out.println("Maximum salary : "+salaries[lastIndex]);

        System.out.println("===========");

        int [] arr1 ={3,2,1};
        int [] arr2 ={2,1,3};

        Arrays.sort(arr1);//1,2,3
        Arrays.sort(arr2);//1,2,3
        System.out.println(Arrays.equals(arr1,arr2));



    }
}
