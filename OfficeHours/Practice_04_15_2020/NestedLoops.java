package OfficeHours.Practice_04_15_2020;


import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E',}, {'F', 'J', 'H'}};

        for (int j = 0; j < arr2D.length; j++) {

            for (int i = 0; i < arr2D[j].length; i++) {

                System.out.println(arr2D[j][i]);//A,B


            }
        }
        System.out.println("=============================");

        for (char[] each1DArray : arr2D) {
            for (char eachElement : each1DArray) {

                System.out.println(eachElement);
            }

        }


    }
}

