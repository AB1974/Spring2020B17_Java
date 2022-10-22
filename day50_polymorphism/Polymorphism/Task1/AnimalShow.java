package day50_polymorphism.Polymorphism.Task1;

public class AnimalShow {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //Reference Animal,object Tiger,Cheetah,Zebra
        Animal tiger = new Tiger();
        Animal cheetah = new Cheetah();
        Animal zebra = new Zebra();
        //(parent)          (child)
        animal.talk();//overriding version will print
        tiger.talk();//overriding version will print
        cheetah.talk();//overriding version will print
        zebra.talk();//overriding version will print
        //if there is no methods in sub class parent class will print

        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();
        animals[1] = new Cheetah();
        animals[2] = new Zebra();

        animals[0].talk();
        animals[1].talk();
        animals[2].talk();



    }
}
