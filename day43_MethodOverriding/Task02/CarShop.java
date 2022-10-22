package day43_MethodOverriding.Task02;

public class CarShop {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.start();//each method has different functions from Car Class

        System.out.println("==================");

        Honda honda = new Honda();
        honda.start();//each method has different functions from Car Class

        System.out.println("============");

        Jeep jeep = new Jeep();
        jeep.start();//each method has different functions from Car Class


        System.out.println("==============");
        BMW bmw = new BMW();
        bmw.start();
    }

}
