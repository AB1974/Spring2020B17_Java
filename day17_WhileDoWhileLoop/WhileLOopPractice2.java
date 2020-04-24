package day17_WhileDoWhileLoop;

public class WhileLOopPractice2 {
/*
Write a program using while loop, that calculates the sum of the even numbers between  0 and 10
 */

    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            if(i %2 ==0){
                System.out.println(i);
            }

        }

        System.out.println("====================================");
        int sum= 0;
        int i = 0;

        while(i <= 10){
            if(i %2 ==0){
                // System.out.println(i);
                sum += i;
            }

            i++;
        }

        System.out.println(sum);













    }

}
