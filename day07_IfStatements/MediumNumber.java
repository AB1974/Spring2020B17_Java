package day07_IfStatements;

public class MediumNumber {


        /*
        4. write a java program that accepts three numbers and return the medium number
				(assume that none of them are equal)

         */

    public static void main(String[] args) {

        double a=100;
        double b=200;
        double c=300;

        boolean aMedium=(a<b && a>c) || (a>b && a<c);

        boolean bMedium=(b<c && b>a) || (b>c && b<a);

        boolean cMedium=(c<b && c>a) || (c>b && c<a);

        if(aMedium){
            System.out.println(a+"a is the medium number");}
        if(bMedium){
            System.out.println(b+"a is the medium number");}
        if(cMedium){
            System.out.println(c+"a is the medium number");}



    }
}
