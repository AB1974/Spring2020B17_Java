package day48_Abstraction;

public class iPhone extends Phone {

    static{
        brand = "iPhone";
    }
    public iPhone(String model, double price, String size) {

        this.model = model;
        this.price = price;
        this.size = size;

    }


    @Override
    public void calling(long phoneNumber) {

        System.out.println("iPhone is calling " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println("iPhone is texting " + phoneNumber);
    }

    public void faceTiming(long phoneNumber) {

        System.out.println("iPhone is facetiming " + phoneNumber);

    }
}
