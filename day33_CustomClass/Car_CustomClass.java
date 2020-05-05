package day33_CustomClass;

public class Car_CustomClass {

    String brand;//object variable
    String model;
    int year;
    String color;//instance variable!they declare out of  block

    public void start() {

        System.out.println(brand + " is started");

    }

    public void drive() {//this is object method
        System.out.println("Driving " + brand + " " + model);

    }

    public void getCarInfo() {
        System.out.println(year + " " + brand + " " + model + " " + color);

    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor) {


        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;

    }

    public String toString() {
       String result = year + " " + brand + " " + model + " " + color;
        return result;
    }

    public static void main(String[] args) {

        int a = 100;//a is local variable that are declared within a block
    }


}
