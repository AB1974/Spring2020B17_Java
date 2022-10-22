package day42_Inheritance.Task03;

import java.util.ArrayList;
import java.util.Arrays;

public class House {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Kocabas", 3, "black", "small", "kangal");
        Dog dog2 = new Dog("Rindik", 2, "White", "Huge", "Kangal");
        Dog dog3 = new Dog("Ajdar", 6, "white", "large", "Alabai");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.addAll(Arrays.asList(dog1, dog2, dog3));
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }
        for (Dog each : dogs) {
            System.out.println(each);
        }
        System.out.println("+=======================");

        Cat cat1 = new Cat("Pity", 4, "brown", "medium", "Siamese");
        Cat cat2 = new Cat("Bonbon", 2, "Brown", "Small", "Abyssinian");
        Cat cat3 = new Cat("Donut", 4, "brownie", "medium", "catwille");

        Cat[] cats = {cat1, cat2, cat3};

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        ArrayList<Cat> Cats = new ArrayList<>();
        Cats.addAll(Arrays.asList(cat1, cat2, cat3));
        for (Cat each : Cats) {
            System.out.println(each);
        }
        System.out.println("===================");
        Bunny bunny1 = new Bunny("Bug", 3, "white", "small", "tiny");
        Bunny bunny2 = new Bunny("Pamuk", 1, "white", "small", "Holland lop");
        Bunny bunny3 = new Bunny("Firfir", 2, "White", "Small", "Angora");

        ArrayList<Bunny> Bunnies = new ArrayList<>();
        Bunnies.addAll(Arrays.asList(bunny1, bunny2, bunny3));
        for (Bunny each : Bunnies) {
            System.out.println(each);
        }

        Bunny[] bunnies = {bunny1, bunny2, bunny3};
        for(int i=0;i<bunnies.length;i++){
            System.out.println(bunnies[i]);
        }


    }


}
