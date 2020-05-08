package CustomMethodCalisma;

public class MyCars {

    public static void main(String[] args) {

        Car car1 = new Car();//You need to create object first
        car1.setCarInfo("Ford", "Fiesta", "Black", 55);

        System.out.println(car1);

        car1.showCurrentSpeed(70);
        car1.showCurrentSpeed(35);

        Car car2 = new Car();
        car2.setCarInfo("Ford", "Mustang", "Red", 130);
        System.out.println(car2);
        car2.drive();
        System.out.println(car2.currentSpeed);
        car2.accelerate(10);
        System.out.println(car2.currentSpeed);

        BMW bmw = new BMW();

        System.out.println(bmw.make);

        bmw.model = "m3";
        bmw.showPrice();
        bmw.model = "740i";
        bmw.showPrice();

        System.out.println("Price:" + bmw.price);
        BMW bmw2 = new BMW();
        bmw2.model = "X3";

        bmw2.showPrice();

        System.out.println("==============");

        Microwave mic = new Microwave();
        mic.brand="LG";



    }
}
