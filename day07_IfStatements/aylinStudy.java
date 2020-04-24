package day07_IfStatements;

import sun.tools.java.Scanner;

import static java.lang.System.in;

public class aylinStudy {

    public static void main(String[] args) {

        int age =21;

        if(age>=21){
            System.out.println("You are eligible to vote");}
        else{
            System.out.println("You are not eligible to vote");}

        int num1=1000;
        int num2=400;
        int num3=600;

        boolean num1isgreatest =num1>num2 && num1>num3;

        boolean num2isgreatest =num2>num3 && num2>num1;

        boolean num3isgreatest =num3>num2 && num3>num1;

        if (num1isgreatest){
            System.out.println(num1+" the greatest number");}

        if (num2isgreatest){
            System.out.println(num2+" the greatest number");}

        if (num3isgreatest){
            System.out.println(num3+" the greatest number");}

        int number = 101;

        if( number%2==0){
            System.out.println(number+ " is  even number");}

        else{
            System.out.println((number+ " is odd number"));}

        int angle1 =50;
        int angle2 =30;
        int angle3 =90;

        if(angle1+angle2+angle3==180){
            System.out.println("This triangle is valid");}

        if(angle1+angle2+angle3<180||angle1+angle2+angle3>180){

            System.out.println("This triangle is not valid");}

        int marks =90;

        if(marks<60){
            System.out.println("Fail");}

        if(marks>=60 && marks<90){
            System.out.println("Pass");}
        if(marks>=90){
            System.out.println("Passed with Distinction");}

        int notes = 100;

        boolean gradeA = 100>=notes && notes>=90;
        boolean gradeB = 89>=notes && notes>=80;
        boolean gradeC = 79>=notes && notes>=70;
        boolean gradeD = 69>=notes && notes>=60;
        boolean gradeE = 59>=notes && notes>=0;

        if(gradeA){
            System.out.println("You got A ");}
        if(gradeB){
            System.out.println("You got B ");}
        if(gradeC){
            System.out.println("You got C ");}
        if(gradeD){
            System.out.println("You got D ");}
        if(gradeE){
            System.out.println("You got E ");}

        int minutes=150;
        int hours=minutes/60;
        int remainingminutes = minutes%60;

        System.out.println(hours);



















    }
}
