package OfficeHours.day_7_Exceptions;

public class Dog extends Animal implements Jumpable{

    String breeds;

    public Dog() {
        species = "Dog";
    }

    @Override
    public void method1() {
        System.out.println("dog");
    }

    @Override
    public void jump() {

    }
}
