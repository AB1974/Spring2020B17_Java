package day21_MultiDimensionalArray;

import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {


        String[] wildAnimals = {"Tiger", "lion", "monkey", "Turtles", "Crocodile"};

        String[] bird = {"Eagle", "Ducks", "Peacock", "Chicken"};
        String[][] zoo = {wildAnimals, bird};
        //      0       1

        String getTheChicken = zoo[1][3];
        System.out.println(getTheChicken);

        String getTheDucks = zoo[1][1];

        System.out.println(getTheDucks);

        System.out.println("+++print all birds from zoo");


        for (String eachBirds : zoo[1]) {

            if (eachBirds.equals("Chicken")) {
                continue;
            }
            {
                System.out.println(eachBirds);
            }

        }
//we can print all element in below method for each//skip the turtles

        System.out.println("================");
        for (String each : zoo[0]) {

            if(each.equals("Turtles")){
                continue;
            }

            System.out.println(each);
        }



}


    }

