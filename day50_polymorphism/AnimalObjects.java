package day50_polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Basky", 5, "Male");
        System.out.println(dog1.dogName);
        dog1.bark();//Dog Basky is barking

        Animal dog2 = new Dog("Lucy", 4, "Female");
        //referenceType//ObjectType
        //Reference decide whether we can access or not !
        // System.out.println(dog2.dogName);
        //dog2.bark();//it gives an compile error
        dog2.eat();//Dog Lucy is eating
        //eat method was in Animal Class but Overridden in Dog class
        //so ALWAYS OVERRIDDEN IS GONNA PRINTED
        dog1.eat();//Dog Basky is eating
        // eat method from overridden method (in Dog class) will be printed

        dog2.methodA();//this overloaded method so only reference type gets executed !(Animal class )

        Animal animal1 = new Cat("Pity", "Male", 4);

        if (animal1 instanceof Cat) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        boolean isDog = animal1 instanceof Dog;
        System.out.println(isDog);//false
        boolean isCat1 = animal1 instanceof Cat;
        System.out.println(isCat1);//true

        Animal animal2 = new Dog("Basky", 1, "Male");

        boolean r1 = animal2 instanceof Cat;
        System.out.println(r1);//false

        Animal animal3 = new Cat("Basky", "Male", 1);

        boolean r3 = animal2 instanceof Animal;
        System.out.println(r3);//true

    }
}
