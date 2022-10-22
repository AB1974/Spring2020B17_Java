package day43_MethodOverriding.Task02;

public class BMW extends Car{

@Override//we are overriding start method from Car class!
    public void start(){
        System.out.println("Call some friends ");
        System.out.println("Tell them to push");
        System.out.println("Remove clutch method suddenly");
    }
}
