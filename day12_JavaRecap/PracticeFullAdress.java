package day12_JavaRecap;
import java.util.Scanner;
public class PracticeFullAdress {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // fullAddress: Building-number  Street, city, state zip code;

        System.out.println("Enter your building number:");
        int BNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address:");
        String str1 =scan.nextLine();

        System.out.println("Enter your zip code:");
        int zipcode=scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your city and state name separated follow by coma and space: ");
        String cityState=scan.nextLine();

        System.out.println("Your address is :\n"+BNumber+" "+str1+" \n"+zipcode+", "+cityState);




    }

}
