package day00_StudyAtHome;

import java.util.Arrays;

public class StringArrayCities {

    public static void main(String[] args) {

        //How do we assign population to cities

        String[] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};

        System.out.println(Arrays.toString(cities));

        int []population=new int[5];

        population[0]=5000;
        population[1]=7000;
        population[2]=1350;
        population[3]=6000;
        population[4]=1780;
        System.out.println("Population of "+cities[0]+" is "+population[0]);
        System.out.println("Population of "+cities[1]+" is "+population[1]);
        System.out.println("Population of "+cities[2]+" is "+population[2]);
        System.out.println("Population of "+cities[3]+" is "+population[3]);
        System.out.println("Population of "+cities[4]+" is "+population[4]);


    }
}
