package day42_Inheritance.Task02;

/**
 * create a class called TV:
 * attributes: brand, model, price,type,size country
 * methods: watch, toString
 */
public class TV extends Device {

    /**
     * brand inherited
     * model inherited
     * price inherited
     * country inherited==static no need to initialize
     * type inherited
     * size inherited
     * watch()==
     * setDevice(inherited)
     * toString() inherited
     */
    public TV(String brand, String model, double price, String size) {//constructor
        setDevice(brand, model, price, "TV", size);
    }

    public void watch() {
        System.out.println("Watching the TV " + brand +" "+ model+" "+type+" that cost me $"+price);
    }

}
