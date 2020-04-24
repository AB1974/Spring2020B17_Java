package day23_Methods;


import java.util.Scanner;
public class task4 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr) {

        //int[]new ={1,2,55,-9,-2,0}
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println("positives:" + positive + ", negatives:" + negative + ", zeros:" + zeros);
    }
}
