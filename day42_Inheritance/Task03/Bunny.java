package day42_Inheritance.Task03;

/**
 * * Bunny:
 * * variables:  name, age, color, size, breed, isPet, numberOfeyes
 * * methods: eat, sleep, drink, toString, ==Dig is not inherited==
 */
public class Bunny extends Pet {

    public Bunny(String name,int age,String color,String size,String breed){
        super(name,age,color,size,breed);

    }
    public void dig() {
        System.out.println(name + " is digging");
    }
}
