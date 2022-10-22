package OfficeHours.Practice_05_20_2020.Animal;

import OfficeHours.Practice_05_20_2020.Animal.Pet;

/**
 * Cat:
 * variables:  name, age, color, size, breed, isPet, numberOfeyes
 * methods: eat, sleep, drink, toString, scratch
 * * all off them are inherited scratch () is not inherited
 */

public class Cat extends Pet {

    public Cat(String name, int age, String color, String size, String breed) {
        setInfo(name, age, color, size, breed);//set info method it will initialize name, age,color,size,breed of the cat

    }

    public void scratch() {

        System.out.println(name + " is scratching ");
    }


}
