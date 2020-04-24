package day22_ArrayAndLoopPractices;
import java.util.*;
public class ScannerWithsArray {
    public static void main(String[] args) {
        /*
          Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line.
         You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
                        we need scanner,array,substring,for loop,for each loop to print out the result,
         */

        Scanner input = new Scanner(System.in);

        String arr[] = new String[5];//in order to assign 5 strings in to the array we use this

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();

        }
        System.out.println(Arrays.toString(arr));

        for(String each:arr){

           // System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));//3 is excluded.first and last characters
            System.out.println(each.substring(0,3));//printing first 3 letters

        }


    }
}
