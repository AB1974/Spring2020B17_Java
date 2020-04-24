package day12_JavaRecap;
import java.util.Scanner;
public class ScannerNextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 7925 JonesBranch Dr, McLean VA, 22034
        // fullAddress: Building-number  Street, city, state zipcode

        System.out.println("Builder Number: ");
        String Bnumber =  input.next();

        input.nextLine(); // used for taking out the Enter from scanner

        System.out.println("Street: ");
        String street = input.nextLine();


        System.out.println("Enter the zip code: ");
        String zipCode = input.next(); // 22034

        input.nextLine(); // take out the Enter

        System.out.println("enter the city name and state separated by comma and space");
        String cityState = input.nextLine();

        String fulladdress = Bnumber+" "+street+", \n"+cityState+" "+zipCode;

        System.out.println(fulladdress);

       // input.close();//closes Scanner

    }

}
