package OfficeHours.Practice_05_13_2020;

public class ConstructorOverload {

    public ConstructorOverload() {
        System.out.println("default");
    }

    public ConstructorOverload(int a) {

        System.out.println("constructor with int ");
    }

    public ConstructorOverload(int a, double b) {

        System.out.println("constructor with int a , double  b ");

    }

    public static void main(String[] args) {

        ConstructorOverload obj = new ConstructorOverload(10,5.0);

    }
}
