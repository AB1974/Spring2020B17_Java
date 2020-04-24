package day08_IfStatements;

import java.util.Scanner;
public class Muradil_Scanner {


    public static void main(String[] args) {


        int minutes =320;
        int hours =minutes/60;
        int remainingMinutes= minutes % 60;
        System.out.println(remainingMinutes);
        System.out.println(hours);

        System.out.println(6+10+" Hello "+(6+10));

        int num =5;

        System.out.println(num%2);

        num=10 ;
        System.out.println(num%2);
        int students=45;
        System.out.println("students: "+students);
        students=students+5;
        System.out.println("students: "+students);
        students=students-2;
        System.out.println("students: "+students);

        int teachers=10;
        teachers+=10;
        System.out.println("teachers: "+ teachers);
        teachers-=4;
        System.out.println("teachers: "+teachers);

        int cars =12; // cars=cars*cars;//cars=cars*2;
        System.out.println("cars: "+cars);
        cars*=2;
        System.out.println("cars: "+cars);
        cars+=cars;
        System.out.println("cars: "+cars);


        int shoes=20;
        shoes/=4;
        System.out.println("shoes: "+shoes);

        int pennies=550;
        pennies %=100;
        System.out.println("Pennies left: "+pennies);

        int apples=10;
        apples=-3;//(assign -3 to apples)
        System.out.println(apples);
        apples++;
        System.out.println(apples);
        apples++; //++ means add +1 in JAVA
        System.out.println(apples);

        int employees=50;
        System.out.println("Employees "+employees);
        employees++;//increase by 1
        employees++;
        employees+=1;
        employees=employees+1;
        employees--;//decrease by 1
        --employees;// decrease by 1

        System.out.println("Employees "+employees);

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number =scan.nextInt();
        System.out.println("You entered "+ number);




        Scanner input=new Scanner(System.in);
        System.out.println("Enter username and password: ");

        String userName= input.next();
        String password= input.next();

        String validUserName ="superuser";
        String validPwd="abc123";

        if(userName.equals(validUserName) && password.equals(validPwd)){
            System.out.println("Access granted. Welcome Agent");
        }else{
            System.out.println("Access denied");}





























    }



}
