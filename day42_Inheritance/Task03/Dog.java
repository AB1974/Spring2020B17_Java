package day42_Inheritance.Task03;

/**
 * Dog:
 * * variables:  name, age, color, size, breed, isPet, numberOeyes
 * * methods: eat, sleep, drink, toString, ====bark() is not inherited
 */
public class Dog extends Pet {


    public Dog(String name,int age,String color,String size,String breed){

        super(name,age,color,size,breed);
    }
    public void bark(){
        System.out.println(name+" is barking ");
    }

}
