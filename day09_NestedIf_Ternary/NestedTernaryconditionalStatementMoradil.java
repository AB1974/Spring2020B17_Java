package day09_NestedIf_Ternary;
import java.util.Scanner;
public class NestedTernaryconditionalStatementMoradil {
    public static void main(String[] args) {

        int bill = 1400;
        int qty = 10;
        int discount =5;

        if (bill > 1000) {
            if (qty > 11) {
                discount = 10;
            } else {
                discount = 9;
            }
        } else {
            discount = 5;

        }
            discount=(bill>1000)?(qty>11)?10:9:5;
        System.out.println(discount);


        System.out.println("=================================");


        Scanner input=new Scanner(System.in);

        System.out.println("Enter seconds:");

        int inputSecond = input.nextInt();
        int resultMinute=(inputSecond/60);
        int resultHour=(resultMinute/60);
        int remainderMinutes = resultMinute % 60;
        int resultSecond=(inputSecond%60);
        System.out.println(resultHour+" hour, "+remainderMinutes+" minute, "+resultSecond +" second ");







    }

}