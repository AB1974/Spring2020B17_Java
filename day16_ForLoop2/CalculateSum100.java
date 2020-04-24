package day16_ForLoop2;

public class CalculateSum100 {

    public static void main(String[] args) {
        /*
        3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
	    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;
         */


        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {


            if (i % 2 == 0) {//even numbers
                sum1 += i;

            } else {//odd numbers
                sum2 += i;

            }

        }

        System.out.println("Sum of all the even numbers:" + sum1);
        System.out.println("Sum of all the odd numbers:" + sum2);
    }
}
