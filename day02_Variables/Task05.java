package day02_Variables;

public class Task05 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a+b; //a=25 b=15
        b=a-b; //a=25 b=10
        a=a-b;


        System.out.println(a);
        System.out.println(b);

        /*

        Task05:
	declare two variables:
			int a =10;
			int b= 15;
	swipe those two variables value WITHOUT using a temporary variable
		Ex:
			System.out.println(a); ===> 15
			System.out.println(b); ===> 10

         */

    }
}
