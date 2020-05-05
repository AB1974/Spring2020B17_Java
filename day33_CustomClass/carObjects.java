package day33_CustomClass;

public class carObjects {

    public static void main(String[] args) {

        Car_CustomClass carCustomClass1 = new Car_CustomClass();//  object class    object name     object
        carCustomClass1.brand = "BMW";
        carCustomClass1.model = "X5";//we are assigning
        carCustomClass1.year = 2020;
        carCustomClass1.color = "red";

        /**
         *    instance variables are called object variables.
         *    Each object has it's own copy of instance variable
         *    you can call them through object name
         *    if there is NO static means instance method!
         */

        System.out.println(carCustomClass1.brand);
        System.out.println(carCustomClass1.model);
        System.out.println(carCustomClass1.year);
        System.out.println(carCustomClass1.color);

        carCustomClass1.start();
        carCustomClass1.drive();
        carCustomClass1.getCarInfo();
        System.out.println("======================");

        Car_CustomClass carCustomClass2 = new Car_CustomClass();//this iS OBJECT (where you see new means OBJECT)
        carCustomClass2.brand = "Toyota";
        carCustomClass2.model = "Corolla";
        carCustomClass2.year = 2019;
        carCustomClass2.color = "blue";
        System.out.println(carCustomClass2.brand);
        System.out.println(carCustomClass2.model);
        System.out.println(carCustomClass2.year);
        System.out.println(carCustomClass2.color);


        carCustomClass2.start();
        carCustomClass2.drive();//car2 is an object
        carCustomClass2.getCarInfo();
        System.out.println("=======================");

        Car_CustomClass carCustomClass3 = new Car_CustomClass();
        carCustomClass3.brand = "Mercedes";
        carCustomClass3.model = "C Class";
        carCustomClass3.year = 2020;
        carCustomClass3.color = "Black";

        carCustomClass3.getCarInfo();
        carCustomClass3.start();
        carCustomClass3.drive();

        System.out.println("=============");

        String str = "A";
        String str2 = "B";
        String[] arr = {str, str2};

        Car_CustomClass[] cars = {carCustomClass1, carCustomClass2, carCustomClass3};
        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();


    }
}
