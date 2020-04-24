package day24_Methods02;

import java.util.*;

public class practices1 {


    public static void main(String[] args) {

        study("Selenium");
        sleep(5);
        countUp(-1);
        countDown(-1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int inputNum = scan.nextInt();
        countUp(inputNum);
        drive("Audi", 90);
        login("mentoring@cybertekschool.com", "mentor001");
        add(2,5);
        subtract(7,8);
        division(6,2);
        multiply(2,3);
        remainder(9,4);


    }

    public static void study(String topic) {

        System.out.println("Student studying " + topic);
    }

    public static void sleep(int hours) {

        System.out.println("Students have been sleeping " + hours + " hours");

    }
/*name:countUP
return type void
param int
it prints from 1 to the value of the parameter
 */


    public static void countUp(int num) {

        if (num < 1) {
            System.out.println("invalid");
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }

    }

    public static void countDown(int num) {

        if (num < 1) {
            System.out.println("invalid");
        } else {
            for (int n = num; n >= 1; n--) {

                System.out.print(n + " ");

            }
            System.out.println();


        }
    }

    public static void drive(String car, int speed) {

        System.out.println(car + " is driving " + speed + " mph");

    }

/*
Name:login
Return type void
2 string:username,password
valid username="mentoring@cybertekschool.com"
valid password="mentor001"
if user name and password match print "Log in successful! Welcome to Okta"
if not :"Sign in failed!"
 */

    public static void login(String username, String password) {

        String validUserName = "mentoring@cybertekschool.com";
        String validPassword = "mentor001";
        if (username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
            System.out.println("Log in successful! Welcome to Okta");

        } else {
            System.out.println("Sign in failed!");
        }
    }

    public static void add(double num1, double num2) {
        double result =num1+num2;
                System.out.println("Result:" + result);

    }
    public static void subtract(double num1, double num2){
    double result =num1-num2;
        System.out.println("Result:" + result);}

    public static void multiply(double num1, double num2){
        double result =num1*num2;
        System.out.println("Result:" + result);}
    public static void division(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("can not divide by zero ");
        } else {
            double result = num1 / num2;
            System.out.println("Result:" + result);
        }
}
public static void remainder(double num1, double num2){
    double result =num1%num2;
    System.out.println("Result:" + result);}
}