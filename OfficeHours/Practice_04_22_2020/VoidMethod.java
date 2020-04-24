package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class VoidMethod {
//EXECUTE THE FUNCTION WITHOUT RETURNING ANY VALUE!
    public static void main(String[] args) {
        boolean USCitizen = true;
        int age = 21;

        Vote(21, USCitizen);//whatever argument you are passing they has to match with parameter.
        Vote(35, false);
        System.out.println("=================");
        //28 years old
        EligibleToBuCig(28);
        EligibleToBuCig(18);
    }

//write a function that can identify if a person is eligible to vote
    //MUST know: age,us citizen

    public static void Vote(int age, boolean USCitizen) {

        boolean eligibleToVote = age >= 18 && USCitizen == true;
        if (eligibleToVote) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote yet");
        }
    }

    //write a program if a person is eligible to buy cigarette.
    //MUST know :age

    public static void EligibleToBuCig(int age) {

        if (age > 18) {
            System.out.println("eligible to buy");
        } else {
            System.out.println("not eligible ");
        }
    }


}
