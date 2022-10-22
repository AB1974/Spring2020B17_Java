package day49_Polymorphisim_Intro;

class Animal extends Robot {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class Robot {

}

public class Polymorphisim_Intro {

    public static void main(String[] args) {

        // Animal obj = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();

        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

        Animal[] animalShow = {obj2, obj3, obj5, obj6};

        Robot OBJ8 =new Animal();
        Robot OBJ9 =new Dog();
        Robot OBj10 =new Cat();

    }
}
