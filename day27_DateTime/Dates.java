package day27_DateTime;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {

        LocalDate date1= LocalDate.of(2020,10,25);//how to declare date ! important

        System.out.println(date1);


        LocalDate birthday=LocalDate.of(1974,04,06);
        System.out.println(birthday);

        //isAfter(date2)
        boolean result1=date1.isAfter(birthday);
        System.out.println(result1);//true
        //isBefore(date2)
        boolean result2=birthday.isBefore(date1);
        System.out.println(result2);
        //isEqual(date2)
        boolean result3=birthday.isEqual(date1);
        System.out.println(result3);
        //isLeapYear(date2)
        boolean result4=birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("===============");
        LocalDate now=LocalDate.now();//today's date!//current date
        System.out.println("Today is "+now);

        String str=now.toString();
        System.out.println(str.replace("-"," "));



    }



}
