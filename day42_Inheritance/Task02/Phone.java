package day42_Inheritance.Task02;

/**
 * create ba class called phone:
 * attributes: brand, model, price, size ,country,type=Phone
 * methods: call, text,  toString
 */
public class Phone extends Device {
    /**
     * brand,model,price,country(we do not initialize the country,size,(inherited), type=Phone
     * toString ()inherited
     * setDevice ()inherited
     * call()
     * text()
     */
    public Phone(String brand, String model, double price, String size) {
        setDevice(brand, model, price, "Phone", size);

    }
    public void call(long number){

        System.out.println("Calling the number "+number );
    }

    public void text(long number){
        System.out.println("Texting to "+number);
    }
}
