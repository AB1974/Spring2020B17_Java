package day08_IfStatements;

import java.util.Scanner;
public class Studyyyyyyyy {

    /*
    Write a program to implement following logic using if-else if-else statement
1. if hour is less than 12 noon, greet with Good Morning
2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
3. if hour is greater than or equal to 3 pm, greet with Good Evening
     */
    public static void main(String[] args) {

        int hour=13;



        if (hour<12){
            System.out.println("Good morning");}
        else if(hour>=12 && hour<15){
            System.out.println("Good afternoon");}
        else{
            System.out.println("Good evening");}


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name; ");
        String firstName =input.next();
        System.out.println("Nice to meet you "+firstName);










    }
}
