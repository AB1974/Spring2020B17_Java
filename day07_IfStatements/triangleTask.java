package day07_IfStatements;

public class triangleTask {
    public static void main(String[] args) {


        int a = 30;
        int b = 70;
        int c = 90;

        int d = a + b + c;

        if (d == 180) {
            System.out.println("The triangle is valid");
        }
        if (d < 180 || d > 180) {
            System.out.println(("The triangle is not valid"));

    }

    /*
	1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
	Write a program that declares three integers as angles and check whether a triangle is valid or not.


     */
}

}

