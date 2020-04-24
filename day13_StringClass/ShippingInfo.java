package day13_StringClass;
import java.util.Scanner;

public class ShippingInfo {
    /*
    warmUp task:
		3. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("Enter your building number: ");

        String BuildingNum = scan.next();//112A+ENTER

        scan.nextLine();

        System.out.println("Enter your street address:");

        String StreetAddress = scan.nextLine();

        System.out.println("Enter your city name:");
        String CityName = scan.nextLine();

        System.out.println("Enter your state:");
        String StateName = scan.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Ship to: " + fullName + "\n\t\t" + BuildingNum + " " + StreetAddress + "\n\t\t" + CityName + ", " + StateName + " " + zipCode);

        System.out.println(result);

    }
}
