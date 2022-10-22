package OfficeHours.day_7_Exceptions;

public class TestPoly {
    public static void main(String[] args) {
        // All of the objects will be Dog objects


        // itself

        Dog dog1 = new Dog();
        System.out.println(dog1.breeds);
        System.out.println(dog1.species);
        System.out.println(dog1.toString());
        dog1.jump();

        // a super class

        Animal dog2 = new Dog();
        Dog dog22= (Dog)dog2;
        System.out.println(dog22.breeds);
        System.out.println(dog2.species);
        System.out.println(dog2.toString());
        ((Dog)dog2).jump();

        // other super class

        Object dog3 = new Dog();
        // System.out.println(dog3.breeds);
        //  System.out.println(dog3.species);
        System.out.println(dog3.toString());
        //  dog3.jump();

        // interface

        Jumpable dog4 = new Dog();
        //  System.out.println(dog4.breeds);
        // System.out.println(dog4.species);
        System.out.println(dog4.toString());
        dog4.jump();


    }
}
