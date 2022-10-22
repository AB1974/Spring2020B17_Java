package day48_Abstraction.warmUp;

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public Phone(String brand, String model, double price, String size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public abstract void calling(long phoneNumber);


}

class iPhone extends Phone {
    public iPhone() {
        super("a", "b", 30, "4");
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iphone is calling "+phoneNumber);
    }
}

class PhoneObjects{

    public static void main(String[] args) {
        iPhone obj=new iPhone();
        obj.calling(434355343);
    }
}