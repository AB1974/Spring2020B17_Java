package Interview;

//abstract class
abstract class Animal {
    //abstract method
    public abstract void animalSound();
}

public class Dog extends Animal {

    public void animalSound() {
        System.out.println("Woof");
    }

    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.animalSound();
    }
}