package day09_NestedIf_Ternary;

import java.util.SortedMap;

public class Nested_IfStatement {
    /*
       //nested if ;if the condition can be evaluate to multiple scenario
       if multiple scenario execution depends on a specific requirement
       if we have precondition

       if(pre-condition){
       statement A
       if(Condition1){
       statement B
       }
       Statement A: ONLY IF PRECONDITION IS TRUE
       only statement A GET EXECUTED IF Precondition is true,condition is false
       Statement A and Statement B gets executed Precondition true and condition1 is true as well!

        */
    public static void main(String[] args) {
        int age = 35;
        boolean USCitizen = true;

        if (USCitizen) {

            if (age > 17) {

                System.out.println("You are eligible to vote");

            } else {
                System.out.println("Grow up first,then Vote");
            }


        } else {
            System.out.println("only USCitizen are eligible to vote Donald");
        }
        System.out.println("===========================");

        int score = 80;

        String grade = "";

        if (score >= 0 && score <= 100) {

            if (score > 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            }else { //if the score is less than zero or greater than 100 than below comment will be executed
                grade = "Invalid";
            }

            System.out.println(grade);

        System.out.println("============================");

        int score2 =75;
        String grade2 ="";

        if(score2>=0 && score2<=100){

            grade2 =(score2 > 90)? "A":(score2 >= 80)? "B":(score2 >= 70)? "C":(score2 >= 60)? "D":"F";

        }else{
            grade2="invalid";
        }
        System.out.println(grade2);
        }
    }
