package day23_Methods;
import java.util.Scanner;
public class Methods_WithParameters {

    //EligibleToBuyAlcohol()=parantezin icindekine argument deniyor

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        EligibleToBuyAlcohol(age);//scanner olmasaydi sadece yas girecektik buraya .

    }

    public static void EligibleToBuyAlcohol(int age) {//parameter variable//parameters can be any data type
         //int age                                                //it can be any primitives and any objects
        if (age >= 21) {

            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Eligible to buy milk");
        }


    }
}
