package day50_polymorphism.Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Inventory {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Flammable {

    public abstract void catchFire();
}

interface Edible {
    public abstract void eat();
}

interface Meltable {

    public abstract void melt();
}

class PropaneTank implements Flammable {

    public void catchFire() {

        System.out.println("Use caution: Propane tank might catch fire");
    }
}

class HairSpray implements Flammable {

    public void catchFire() {
        System.out.println("Be careful , you catch a fire ");
    }
}

class Store {

    public static void main(String[] args) {
        HairSpray hp = new HairSpray();
        hp.catchFire();

        Flammable f1 = new HairSpray();//Flammable Interface
        f1.catchFire();

        //interface             implementing class/sub class
        Flammable pTank = new PropaneTank();//Flammable Interface
        // Flammable--> Referance type Data Type
        //fb reference variable name
        //PropaneTank object type

        pTank.catchFire();

        Flammable item;
        item = new HairSpray();
        item.catchFire();
        item = new PropaneTank();
        item.catchFire();

        List<Flammable> items = new ArrayList<>(Arrays.asList(new HairSpray(),new PropaneTank()));
        System.out.println(items);


    }
}
