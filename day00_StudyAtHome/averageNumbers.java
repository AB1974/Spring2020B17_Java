package day00_StudyAtHome;
import java.util.Arrays;
import java.util.Scanner;
public class averageNumbers {
    public static void main(String[] args) {

        int[] array = {4, 5, 6, 7, 8, 9, 10};

//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//
//            sum += array[i];
//        }
//int b=array.length;
//        System.out.println(sum /b);

        int sum = 0;
        for (int each : array) {

            sum += each;

        }
        System.out.println(sum / array.length);


String words [] = {"Hello", "Engin"};

        for (String each: words){

            String fl = each.substring(0,1)+each.substring(each.length()-1);

            System.out.println(fl);

        }



    }

}