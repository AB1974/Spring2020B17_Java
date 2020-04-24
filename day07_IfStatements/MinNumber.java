package day07_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        /*

        3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
         */

        double a=100;
        double b=200;
        double c=600;

        boolean aMin =a<b && a<c ;
        boolean bMin =b<c && b<a ;
        boolean cMin =c<b && c<a ;

        if(aMin) {
            System.out.println(a + " is the minimum number");
        }

        if(bMin) {
            System.out.println(b + " is the minimum number");
        }

        if(cMin) {
            System.out.println(c + " is the minimum number");
        }



    }
}
