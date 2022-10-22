package OfficeHours.Practice_05_20_2020.Animal;

import OfficeHours.Practice_05_20_2020.Animal.Bunny;
import OfficeHours.Practice_05_20_2020.Animal.Cat;
import OfficeHours.Practice_05_20_2020.Animal.Dog;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Pasa", 5, "lightBrown", "large", "Akbas");

        System.out.println(dog1);
        Dog dog2 = new Dog("Rindik", 5, "White", "Huge", "Kangal");

        //dog1.setInfo();
        System.out.println(dog2);
        dog2.bark();

        Cat cat1 = new Cat("Pity",5,"Brown","medium","siamese");
        //cat1.setInfo();
        System.out.println(cat1);
        cat1.scratch();

        Bunny bunny1=new Bunny("Bug",2,"small","black","tiny");
        System.out.println(bunny1);
        bunny1.Dig();

    }
}
