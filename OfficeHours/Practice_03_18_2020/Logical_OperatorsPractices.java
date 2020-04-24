package OfficeHours.Practice_03_18_2020;

public class Logical_OperatorsPractices {
    public static void main(String[] args) {
        // || , &&, !

        boolean r1="Muhtar" == "Bad Guy";

        System.out.println(r1);

        boolean r2 ="Muhtar"!="Good Guy";
        System.out.println(r2);

        boolean r3=10>=9;
        System.out.println(r3);

        //|| one condition is true it will return =true
        //&& one condition is false it will return =false

        boolean result1= 9!=8 || 9==8;
                        //true || false==true
        System.out.println(result1);

        boolean result2= 9!=8 && 9==8;
                //true || false==true
        System.out.println(result2);

        boolean result3 =6>5 && 6<4;
        System.out.println(result3);

        //single if statement
        //if(condition){statements;}







    }
}
