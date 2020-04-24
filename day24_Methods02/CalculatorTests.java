package day24_Methods02;
import java.util.*;
public class CalculatorTests {

    public static void main(String[] args) {
        practices1.add(45,9);
        practices1.division(6,2);
        practices1.remainder(90,5);

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two numbers");
        double n1=scan.nextDouble();
        double n2=scan.nextDouble();
        System.out.println("Select operator:'+','-','*','/','%'");
        String operator=scan.next();

        switch (operator){

            case "+":
                practices1.add(n1,n2);
                break;
            case "-":
                practices1.subtract(n1,n2);
                break;
            case "*":
                practices1.multiply(n1,n2);
                break;
            case "/":
                practices1.division(n1,n2);
                break;
            case "%":
                practices1.remainder(n1,n2);
                break;
            default:
                System.out.println("invalid");
        }
    }


}
