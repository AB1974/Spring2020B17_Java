package OfficeHours.Practice_05_20_2020.Animal;

import OfficeHours.Practice_05_20_2020.Animal.Pet;

/**
 * Dog:
 * variables:  name, age, color, size, breed, isPet, numberOfEyes
 * methods: eat, sleep, drink, toString,setInfo(), bark
 * all off them are inherited bark () is not inherited
 */


public class Dog extends Pet {

    public Dog(String name, int age, String color, String size, String breed) {
        setInfo(name, age, color, size, breed);//set info method is inherited to subclasses
        //constructor can not be inherited !!! its rule

    }

    public void bark() {
        System.out.println(name + " is barking ");
    }


}
