package day43_MethodOverriding.Task02;

public class Jeep extends Car {
    @Override
    void start(){//we can give public ,protected or default as access modifier
        System.out.println("Call Mechanic ");
        System.out.println("Oil Change");
        System.out.println("Jump Start");
    }

}
