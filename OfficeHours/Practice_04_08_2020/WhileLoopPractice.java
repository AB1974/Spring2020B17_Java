package OfficeHours.Practice_04_08_2020;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /*
            while(Condition){
                    statements
            }
            repeated if statement
            execution order:
                1. condition
                    if true: executes statements
                    if false: stops the loop
         */

        for(int i= 0; i < 5; i++){
            System.out.println("Hello World");
        }

        System.out.println("===================================");

        int z = 0; //1
        while(z<5){

            System.out.println(z); //0
            z++;

        }


        System.out.println("===========================================");
        int j =0;
        while(j <= 100){
            if(j%15 ==0 ) {
                System.out.print(j + " ");
            }

            j++;
        }

        System.out.println("=============================");

     int k=0;
     while(k<=100){

         if(k%15==0 && k%3==0){

           k++;
         }
     }
        System.out.println(k);
    }
}