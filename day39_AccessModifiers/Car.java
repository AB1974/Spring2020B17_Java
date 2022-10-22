package day39_AccessModifiers;

/**
 * 1. create a class called Car:
 * instance variable:
 * brand, model, year, price
 * add a constructor that can initialize brand of car
 * add a constructor that can initialize brand and model of the car
 * (apply constructor call to initialize the brand)
 * add a constructor that can initialize the brand, model, year of the car
 * (apply constructor call to initialize brand, model)
 * add a constructor that can initialize brand, model, year and price of the car
 * (apply constructor call to initialize brand, model, year)
 * add toString method
 */
public class Car {//example for constructor overloading !//ChainRule

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand) {//1.constructor
        this.brand = brand;
    }

    public Car(String brand, String model) {//2.constructor
        this(brand);//we are calling 1. constructor.
        //   this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {//3.constructor
        this(brand, model);//we are calling 2. constructor.
        //this.brand=brand;
        //this.model=model;
        this.year = year;

    }

    public Car(String brand, String model, int year, double price) {//4.constructor
        this(brand, model, year);//we are calling 3. constructor.
        //this.brand=brand;
        //this.model=model;
        // this.year = year;
        this.price = price;

    }

    public String toString() {

        return year + " " + brand + " " + model + " $" + price;
    }

}
