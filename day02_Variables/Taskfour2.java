package day02_Variables;

public class Taskfour2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int temp = a+b;

        b =temp-b;
        a =temp-a;



        System.out.println(a+"\n"+b);


        /*

        declare two variables:
			int a =10;
			int b= 15;
	swipe those two variables value using a temporary variable
		Ex:
			System.out.println(a); ===> 15
         */
    }
}
