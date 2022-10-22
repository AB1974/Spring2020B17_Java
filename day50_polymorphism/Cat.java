package day50_polymorphism;

/**
 * * 2. create subclass of Animal named Cat
 * * variable: catName
 * * methods: scratch
 */
public final class Cat extends Animal {

    public String catName;//3 variables (2 comes from Animal Class)
    // 3 instance methods


    public Cat(String catName, String gender, int age) {
        this.gender = gender;
        this.catName = catName;
        this.age = age;
    }

    @Override
    public void eat() {//Overriding method
        System.out.println("Cat " + catName + " is eating ");
    }

    @Override
    public void sleep() {//Overriding method
        System.out.println("Cat " + catName + " is sleeping ");
    }

    public void scratch() {
        System.out.println("Cat " + catName + " is scratching ");
    }

}
