package day42_Inheritance.Task03;

/**
 * Cat:
 * * variables:  name, age, color, size, breed, isPet, numberOfeyes
 * * methods: eat, sleep, drink, toString, =====scratch() is not inherited
 */
public class Cat extends Pet {

    public Cat(String name, int age, String color, String size, String breed) {
        super(name, age, color, size, breed);
    }

    public void scratch() {
        System.out.println(name + " is scratching ");
    }

}
