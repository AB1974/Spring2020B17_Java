package day48_Abstraction.Task1;

/**
 * Task01:
 * 1. create an interface named Edible
 * abstract method: eat();
 * 2. create an interface named Drinkable that can inherit from Edible
 * abstract method: drink();
 * 3. create an class named Burger that can inherit from Edible
 * variables: name, size
 * method: toString();
 * create a constructor that can initialize instance variables
 * 4. create another class called IceCoffee  that can inherit from Drinkable
 * variable: size
 * method: toString()
 * create constructor that can set the size
 * fix any error might come up
 */
interface Edible {

    void eat();
}


interface Drinkable extends Edible {

    void drink();


}


class Burger implements Edible {
    String name;
    String size;

    public Burger(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String toString() {
        return "Name: " + name + "Size: " + size;
    }

    @Override
    public void eat() {
        System.out.println("Eating " + size + " Big Burger");
    }

}

class IceCoffee implements Drinkable {

    String size;

    public IceCoffee(String size) {
        this.size = size;
    }

    @Override
    public void drink() {
        System.out.println("Drinking " + size + " IceCoffee");
    }

    @Override
    public void eat() {
        System.out.println("Eating " + size + " Big Burger");
    }

    public String toString() {
        return "Size: " + size + " Ice Coffee is delicious";
    }


}

public class Objects {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Wooper ", " XLarge");
        System.out.println(burger1);
        burger1.eat();
        IceCoffee coffee1 = new IceCoffee("Large ");
        System.out.println(coffee1);
        coffee1.drink();


    }
}
