package day23_Methods;

import java.util.*;

public class Task2 {


    public static void main(String[] args) {

        MaximumNumber(3);
        MinimumNumber(3);

    }

    public static void MaximumNumber(int a) {

        int[] num = new int[a];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter  numbers: ");

        for (int i = 0; i < a; i++) {
            int number = scan.nextInt();
            num[i] = number;

        }

        Arrays.sort(num);

        System.out.println(num[num.length - 1]);


    }

    public static void MinimumNumber(int a) {

        Scanner scan = new Scanner(System.in);

        int[] number = new int[a];

        for (int i = 0; i < a; i++) {
            int num = scan.nextInt();
            number[i] = num;


        }

        Arrays.sort(number);


        System.out.println(number[0]);

    }


}
