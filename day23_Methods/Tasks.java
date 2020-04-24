package day23_Methods;
import java.util.*;

import java.util.*;
    /*
    4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */

public class Tasks {

    public static void main(String[] args) {

        MaximumNumber(3);
        MinimumNumber(3);

    }

    public static void MaximumNumber(int num) {


        int[] number = new int[num];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your numbers");
        for (int i = 0; i < num; i++) {
            int abc = scan.nextInt();
            number[i] = abc;
        }
        Arrays.sort(number);

        System.out.println(number[number.length - 1]);


    }

    public static void MinimumNumber(int a) {

        int[] num = new int[a];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your numbers");


        for (int i = 0; i < a; i++) {
            int number = scan.nextInt();//8,67,5
            num[i] = number;//0->8,1-67,2->5


        }
        Arrays.sort(num);
        System.out.println(num[0]);
    }


}




