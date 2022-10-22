package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("Audi", "A3");
        System.out.println(car2);

        Car car3 = new Car("Honda", "Pilot", 2020);
        System.out.println(car3);

        Car car4 = new Car("VW", "Jetta", 2019, 18000);
        System.out.println(car4);
    }


}
