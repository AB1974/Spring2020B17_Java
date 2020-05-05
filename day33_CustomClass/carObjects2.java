package day33_CustomClass;

public class carObjects2 {

    public static void main(String[] args) {
/**
 *  create 5 car objects
 *  put them in an arrays of cars
 *  use for loop to get each car info
 *  use for each loop to get each car info
 */

        Car_CustomClass carCustomClass1 = new Car_CustomClass();
        carCustomClass1.setCarInfo("BMW", "X6", 2020, "WHITE");
        carCustomClass1.getCarInfo();

        System.out.println("=below steps same as above or same as one below ");
        Car_CustomClass carCustomClass2 = new Car_CustomClass();
        carCustomClass2.brand = "Toyota";
        carCustomClass2.model = "Corolla";
        carCustomClass2.year = 2020;
        carCustomClass2.color = "red";
        carCustomClass2.getCarInfo();

        carCustomClass2.setCarInfo("Toyota", "Corolla", 2020, "Red");
        carCustomClass2.getCarInfo();

        Car_CustomClass carCustomClass3 = new Car_CustomClass();
        carCustomClass3.setCarInfo("Audi", "A3", 2020, "Black");
        carCustomClass3.getCarInfo();

        System.out.println("==========================");

        Car_CustomClass[] cars = {carCustomClass1, carCustomClass2, carCustomClass3};

        for (int i = 0; i < cars.length; i++) {

            cars[i].getCarInfo();


        }
        System.out.println("==========================");
        for (Car_CustomClass eachCar : cars) {
            eachCar.getCarInfo();

        }

        System.out.println("===============");
        System.out.println(carCustomClass1);
    }
}
