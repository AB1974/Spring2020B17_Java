package day41_Inheritance.Animal;

/**
 * public class Animal {
 * <p>
 * public String name;
 * public String size;
 * public double weight;
 * <p>
 * public void eat() {
 * System.out.println(name + " is eating");
 * }
 * public void move() {
 * System.out.println(name + " is moving");}
 */
public class Dog extends Animal {//Dog (sub class) is  using super (parent )animal class

    public void bark() {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Pasa";

        System.out.println(dog1.name);
        dog1.move();
        dog1.eat();
        dog1.bark();
    }
}
