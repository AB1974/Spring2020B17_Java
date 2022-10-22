package day38_Constructors;

public class Dog {

    String name;
    String breed;
    int age;

    public Dog() {
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public Dog(String breed) {
        this.breed = breed;//we only assign breed
        name = "unknown";
        age = 0;
    }

    public Dog(String breed, int age) {
        this.breed = breed;//we assign breed
        this.age = age;//we assign age
        name = "unknown";

    }

    public String toString() {

        return "Name: " + name + " Breed: " + breed + " Age: " + age;

    }



    public static void main(String[] args) { //constructor gets executed when you create object
        Dog dog1 = new Dog();
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println("==============");

        Dog dog2 = new Dog("Golden");
        System.out.println(dog2.name);//unknown
        System.out.println(dog2.breed);//Golden
        System.out.println(dog2.age);//0
        System.out.println("===============");

        Dog dog3 = new Dog("Puddle", 4);
        System.out.println(dog3.name);//unknown
        System.out.println(dog3.breed);//Poddle
        System.out.println(dog3.age);//4
        System.out.println("==========");
        System.out.println(dog3);
        System.out.println(dog2);
        System.out.println(dog1);

    }
}
