package day50_polymorphism.Polymorphism.Apple;

public class Mac extends AppleDevice {
    @Override
    public void use() {
        System.out.println("Mac| Computer|Code|Read Book");
    }

    public void code(){
        System.out.println("Coding Java with Mac");
    }
}
