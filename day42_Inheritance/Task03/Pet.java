package day42_Inheritance.Task03;

/**
 * custom class: Cat, Dog, Bunny
 * Dog:
 * variables:  name, age, color, size, breed, isPet, numberOeyes
 * methods: eat, sleep, drink, toString, bark
 * Cat:
 * variables:  name, age, color, size, breed, isPet, numberOfeyes
 * methods: eat, sleep, drink, toString, scratch
 * Bunny:
 * variables:  name, age, color, size, breed, isPet, numberOfeyes
 * methods: eat, sleep, drink, toString, Dig
 * custom class: pet
 * variables:  name, age, color, size, breed, isPet, numberOfeyes
 * methods:    eat, sleep, drink, toString
 */
public class Pet {
    public String name;
    public int age;
    public String color;
    public String size;
    public String breed;
    public static boolean isPet = true;
    public static int numberOfEyes = 2;

    public Pet(String name, int age, String color, String size, String breed) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.size=size;
        this.breed=breed;

    }

    public void setInfo(String name, int age, String color, String size, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void sleep(int hours) {
        System.out.println(name + " is sleeping "+hours+" hours ");
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {

        return "Name: " + name + ", Age: " + age + ", Color " + color + ", Size: " + size + ", Breed " + breed;
    }


}
