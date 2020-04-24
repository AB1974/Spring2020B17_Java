package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice2 {


    public static void main(String[] args) {
        byte age = 20;
        boolean eligibleToBuy = age > 21 || age == 21;  // age >=21

        if (eligibleToBuy) {
            System.out.println("Here is your Vodka");
        }

        if (!eligibleToBuy) {
            System.out.println("Go drink your milk");
        }

        boolean feelingHappy = false;

        if (feelingHappy == false) {
            System.out.println("don't be sad");
        }

        if (feelingHappy == true) {
            System.out.println("Stay happy");

            }


        }


    }



