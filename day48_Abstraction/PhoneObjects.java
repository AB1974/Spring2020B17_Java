package day48_Abstraction;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("X", 1000, "10 inches");
        iPhone iphone2 = new iPhone("8", 900, "8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(1234567);
        iphone1.calling(911);
        iphone1.texting(546456456);

        System.out.println("===============================");

        Samsung samsung1 = new Samsung("Note 10 Plus", 1200, "Large");
        Samsung samsung2 = new Samsung("Note 9", 1000, "medium");
        System.out.println(samsung1);
        System.out.println(samsung2);
        samsung1.calling(1234567);
        samsung1.texting(565695605);
        samsung1.freezing();


    }
}
