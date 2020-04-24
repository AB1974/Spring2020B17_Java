package day21_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        for(DataType variableName:Array){}
         */
        int[] nums = {1, 2, 3, 4};

        for (int each : nums) {//the numbers of execution times of the loop is length.

            System.out.println(each);}

        System.out.println("==============");

        String[] student = {"Muhtar", "Asiya", "Moradil"};

        for (String each : student) {

            System.out.println(each);
        }

        System.out.println("==for each loop============");

        //for each loop always starts index 0

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};//its always starts index (0)

        for (int each : arr1) {

            if (each >= 5) {//if(each<5){continue;}

                System.out.println(each);
            }
        }
        System.out.println("= regular for loop========");

        String sentence ="I like Java"; //reverse it!!

        String []words =sentence.split(" ");//[I,like,Java]
        String reverse="";
        for (int i=words.length-1 ;i>=0 ;i--){

            System.out.println(words[i]);
        }
/*
given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com",
        "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com",
                "Cybertek@outlook.com"};


        for( String eachEmail : emails) {


            if (!eachEmail.endsWith("@gmail.com")) {

                System.out.println(eachEmail);
            }

        }

    }


    }

