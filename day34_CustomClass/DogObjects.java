package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();//object

        dog1.setDogInfo("Husky", "Small", 4, "White", "Ghost");

        /**
         *         dog1.breed = "Husky";
         *         dog1.size = "Small";
         *         dog1.age = 4;
         *         dog1.color = "White";
         *         dog1.name = "Ghost";
         */

        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.name);

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Eksta Big", 5, "Brown", "Ajdar");
        Dog dog3 = new Dog();
        dog3.setDogInfo("Poddle", "Miniature", 2, "White", "Lucy");
        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");
        Dog dog5 = new Dog();
        dog5.setDogInfo("Pomeranian", "Small", 4, "White", "Ernie");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("#########We want to create list holds all dogs information #####");
        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3));
        puppies.addAll(Arrays.asList(dog4, dog5));


        for (int i = 0; i < puppies.size(); i++) {

            Dog eachDog = puppies.get(i);
            System.out.println(eachDog);
        }
        System.out.println("==========================");
        puppies.removeIf(p -> p.age > 2);

        for (int i = 0; i < puppies.size(); i++) {
            Dog eachdog = puppies.get(i);
            System.out.println(eachdog);
        }

    }
}
