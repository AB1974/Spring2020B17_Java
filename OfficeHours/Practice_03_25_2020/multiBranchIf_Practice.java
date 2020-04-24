package OfficeHours.Practice_03_25_2020;



public class multiBranchIf_Practice {
    public static void main(String[] args) {


        int number =-5;

        if (number > 0) {
            System.out.println("It's positive number");
        }else if(number<0) {
            System.out.println("It's negative number");
        }else{
            System.out.println("It is zero");}

        System.out.println("==========================");

        String browserName ="Chrome";

        if(browserName=="Firefox"){
            System.out.println("Firefox browser is opening");
        }else if(browserName=="Chrome") {
            System.out.println("Chrome browser is opening");
        }else if(browserName=="Internet Explorer"){
            System.out.println("IE browser is opening");
        }else if(browserName=="Safari ") {
            System.out.println("Safari browser is opening");
        }else if(browserName=="Opera"){
            System.out.println(("Opera browser is opening"));
        }else{
            System.out.println("invalid Browser Name");}
    }
}
