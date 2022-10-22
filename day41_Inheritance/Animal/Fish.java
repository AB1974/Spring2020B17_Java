package day41_Inheritance.Animal;

public class Fish extends Animal { //it has 3 methods 2 from animal (super )class 1 from fish (sub)class

public void swim(){

    System.out.println(name+" is swimming");
}

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.name="Nemo";
        fish1.weight=5.0;
        fish1.size="small";

        System.out.println(fish1.name);

        fish1.move();
        fish1.eat();
        fish1.swim();
    }

}
