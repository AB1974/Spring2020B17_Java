package day35_Static;


public class staticPractice2 {

    String brand;
    String Model;
    static Boolean hasWheels = true;

    public void printBrand() {
        System.out.println(brand);

    }

    public void printModel() {

        System.out.println(Model);
    }

    public static void main(String[] args) {
        System.out.println(hasWheels);
    }

}
