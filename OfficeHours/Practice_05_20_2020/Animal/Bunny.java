package OfficeHours.Practice_05_20_2020.Animal;

import OfficeHours.Practice_05_20_2020.Animal.Pet;

/**
 * Bunny:
 * variables:  name, age, color, size, breed, isPet, numberOfeyes
 * methods: eat, sleep, drink, toString, Dig
 * all off them are inherited Dig () is not inherited
 */

public class Bunny extends Pet {

    public Bunny(String name, int age, String color, String size, String breed){
        setInfo(name,age,color,size,breed);
    }

    public void Dig() {

        System.out.println(name + " is digging ");
    }
}
