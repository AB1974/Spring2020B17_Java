package day43_MethodOverriding.Task02;

import day43_MethodOverriding.Task02.Car;

public class Tesla extends Car {

    @Override
    public void start() {
        System.out.println("Push the start button");
    }
}
