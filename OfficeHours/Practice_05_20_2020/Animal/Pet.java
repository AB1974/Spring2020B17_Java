package OfficeHours.Practice_05_20_2020.Animal;

/**
 * custom class: pet
 * variables:  name, age, color, size, breed, isPet, numberOfEyes
 * methods:    eat, sleep, drink, toString
 */
public class Pet {
    //Protected they are visible to any subclass!
    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;
    protected static boolean isPet = true;
    protected static int numberOfEyes = 2;

    public void eat(String food) {

        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {

        System.out.println(name + " is drinking " + drink);
    }

    public void sleep() {

        System.out.println(name + " is sleeping ");
    }

    public String toString() {

        return "name " + name + ", age " + age + ",  color " + color + ", size " + size + ", breed " + breed;
    }

    public void setInfo(String name, int age, String color, String size, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
    }
}


