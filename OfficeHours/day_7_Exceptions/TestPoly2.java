package OfficeHours.day_7_Exceptions;

public class TestPoly2 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.method1();
        System.out.println(dog1.species);

        Animal dog2 = new Dog();
        dog2.method1();
        System.out.println(dog2.species);

        Animal dog3 = new Animal();
        dog3.method1();
        System.out.println(dog3.species);
    }
}