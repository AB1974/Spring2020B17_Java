package day50_polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        System.out.println("=====UPCASTING============");
        int a = 100;
        double b = (double) a;//implicitly done
        //
        Dog dog = new Dog("a", 1, "f");

        Animal animal1 = (Animal) dog;//upcasting done implicitly.its done by compiler automaticially

        Cat cat = new Cat("pit", "female", 2);

        Animal animal2 = (Animal) cat;//upcasting
        Animal animal3 = cat; //upcasting automaticially . there has to be is A relation

        System.out.println("=======DOWN CASTING============");

        double c = 10;
        int d = (int) c;

        Animal animal4 = new Dog("a", 2, "f");
        //super         //sub

        Dog dog3 = (Dog) animal4;//explicit casting has to be manual which means downcasting

        Animal animal5 = new Cat("c", "female", 2);
//reference type what can be accesible which is ANIMAL
        Cat cat2 = (Cat) animal5;//downcasting
        System.out.println("==========================");
        Animal animal6 = new Dog("a", 4, "male");
        //animal6.bark();//you can not access bark()method through Animal (reference class)
        //first way
        Dog dog2 = (Dog) animal6;
        dog2.bark();
        //send way
        ((Dog) animal6).bark();//DOWNCASTING IN ORDER TO ACCESS SUB CLASS FEATUES


    }
}
