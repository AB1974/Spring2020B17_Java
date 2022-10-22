package day48_Abstraction.Task2;

/**
 * Task02:
 * 1. create an interface named downloadable:
 * variable: boolean downloadable
 * abstract method: download();
 * 1. create an interface named AndroidApps that can inherit from downloadable interface
 * variable: AppStoreName
 * 2. create an interface named AppleApps that can inherit from downloadable interface
 * variable: AppStoreName
 * 3. create an abstract class named Phone
 * variables: brand, model, price, size
 * abstract methods: texting(), calling()
 * 4. create a class named iPhone that can inherit from AppleApps interface
 * actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
 * 5. create a class named Nokia that can inherit from AndroidApps interface
 * actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
 * in each sub classes of phone, create a constructor to initialize the instances
 */
interface downloadable {

    boolean downloadable = true;//public static final

    void download();//public abstract

}

interface AndroidApps extends downloadable {//2 variable 1,abstract method
    String AppStoreName = "Android";//public static final
}

interface AppleApps extends downloadable {//2 variable 1,abstract method
    String AppStoreName = "Apple";//public static final

}

abstract class Phone {
    public static String brand;//can not be final,nor private
    public String model, size;
    public double price;


    abstract void texting(long phoneNUmber);

    abstract void calling(long phoneNumber);

    public String toString() {
        return "brand=" + brand + ", model=" + model + ", price=" + price + ", size=" + size;
    }


}

final class iPhone extends Phone implements AppleApps {

    static {
        brand = "Apple";
    }

    public iPhone(String model, double price, String size) {

        this.model = model;
        this.price = price;
        this.size = size;

    }

    @Override
    public void download() {

        System.out.println("iphone is downlading apps from " + AppStoreName);
    }

    @Override
    void texting(long phoneNumber) {
        System.out.println("iphone is texting " + phoneNumber);
    }

    @Override
    void calling(long phoneNumber) {
        System.out.println("iphone is calling " + phoneNumber);
    }

    void faceTiming(long phoneNumber) {
        System.out.println("iphone is facetiming to " + phoneNumber);
    }


}

final class Nokia extends Phone implements AndroidApps {

    static {
        brand = "Nokia";
    }

    Nokia(String model, double price, String size) {

        this.model = model;
        this.price = price;
        this.size = size;


    }

    public void download() {

        System.out.println("NOKIA  is downlading from " + AppStoreName);
    }

    @Override
    void texting(long phoneNumber) {

        System.out.println("nokia is texting " + phoneNumber);
    }

    @Override
    void calling(long phoneNumber) {

        System.out.println("nokia is calling " + phoneNumber);
    }

    void freezing() {

        System.out.println("nokia is freezing ");
    }

    void breakTheFloor() {
        System.out.println("nokia is breaking the floor ");
    }


}

public final class Objects {
    public static void main(String[] args) {
        iPhone iphone1 = new iPhone("5S", 500, "5 inch");
        Nokia nokia1 = new Nokia("Nokia5", 300, "5 inch");
        System.out.println(iphone1);
        System.out.println(nokia1);
        iphone1.download();
        iphone1.calling(911);
        nokia1.breakTheFloor();
        nokia1.download();
        iphone1.download();
    }


}