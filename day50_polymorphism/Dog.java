package day50_polymorphism;

/**
 * * 3. create subclass of Animal named Dog
 * * variable: dogName
 * * methods: barks:
 */
public final class Dog extends Animal {//3 variable,3 methods
    public String dogName;

    public Dog(String dogName, int age, String gender) {
        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void eat() {
        System.out.println("Dog " + dogName + " is eating ");
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + dogName + " is sleeping ");
    }

    public void bark() {
        System.out.println("Dog " + dogName + " is barking ");
    }

    public static void methodA(int a){//OVERLOADED METHOD
        System.out.println("Dog class  A");
    }

}
