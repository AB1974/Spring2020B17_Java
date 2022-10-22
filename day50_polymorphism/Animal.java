package day50_polymorphism;

/**
 * Warmup tasks:
 * 1. cerate a class Animal
 * variables: age, gender
 * methods: eat, sleep
 * DO NOT make abstract we need this for today's example
 * 2. create subclass of Animal named Cat
 * variable: catName
 * methods: scratch
 * c
 */
public abstract class Animal {//2 variables//2 instance methods

    public int age;
    public String gender;


    public void eat() {//instance methods
        System.out.println("Animal is eating");

    }

    public void sleep() {//instance methods

        System.out.println("Animal is sleeping");
    }

    public static void methodA() {
        System.out.println("Animal ");
    }
}

