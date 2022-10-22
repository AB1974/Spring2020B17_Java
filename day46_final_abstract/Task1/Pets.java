package day46_final_abstract.Task1;

/**
 * abstraction practice tasks:
 * Task01:
 * 1. create an abstract class called Pets
 * attributes: name, age, color, breed, gender
 * methods:
 * abstract methods: sleep, eat, speak
 * instance method: toString
 * 2. create three sub classes (non-abstract) of pet:
 * 1. Dog
 * 2. Cat
 * 3. Tiger
 * each class MUST have constructors to initialize the attributes
 */
public abstract class Pets {
    int age;
    String name;
    String color;
    String breed;
    char gender;

    public Pets(int age, String name, String color, String breed, char gender) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }

    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();

    public String toString() {

        return "Name: " + name + ", Age: " + age + ", Color: " + color + " Breed: " + breed + " Gender: " + gender;
    }


}


class Cat extends Pets {


    public Cat(int age, String name, String color, String breed, char gender) {
        super(age, name, color, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating ");
    }

    public void sleep() {
        System.out.println(name + " is sleeping ");

    }

    public void speak() {
        System.out.println(name + " is speaking ");
    }
}

class Dog extends Pets {

    public Dog(int age, String name, String color, String breed, char gender) {
        super(age, name, color, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating ");
    }

    public void sleep() {
        System.out.println(name + " is sleeping ");

    }

    public void speak() {
        System.out.println(name + " is barking ");
    }
}

class Tiger extends Pets {

    public Tiger(int age, String name, String color, String breed, char gender) {
        super(age, name, color, breed, gender);


    }

    @Override
    public void eat() {
        System.out.println(name + " is eating ");
    }

    public void sleep() {
        System.out.println(name + " is sleeping ");

    }

    public void speak() {
        System.out.println(name + " is speaking ");
    }
}

class PetsObject {

    public static void main(String[] args) {
        Dog obj1 = new Dog(3, "Barny", "Brown", "Golden", 'M');
        obj1.eat();
        obj1.sleep();
        obj1.speak();
        System.out.println(obj1);

        Cat obj2 = new Cat(5, "Pity", "Brown", "Simease", 'M');
        obj2.eat();
        obj2.sleep();
        obj2.speak();
        System.out.println(obj2);

        Tiger obj3 = new Tiger(7, "Wild", "Yellow", "African", 'F');
        obj3.eat();
        obj3.sleep();
        obj3.speak();
        System.out.println(obj3);
    }
}
