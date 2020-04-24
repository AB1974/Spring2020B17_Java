package day04_JavaRecap;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println( 9.5 + 3 );  // 12.5

        System.out.println( 20.5 - 10 ); // 10.5

        System.out.println( 3 * 5.5 ); // 16.5

        // 2.5
        System.out.println( 10 / 4 );  // 2, int only accepts whole numbers

        System.out.println( 10.0 / 4 );  // 2.5

        System.out.println( 10 / 4.0 );  // 2.5

        //2.5
        double a1 = 10/4 ;
        // a1 = 2; ==> 2.0
        System.out.println(a1);

        double a2 = 10L / 4 ;
        // a2 = 2L; ==> 2.0
        System.out.println(a2);


        double a3 = 10 / 4f; // 2.5
        System.out.println( a3 );

        double a4 = 10 / 4.0;
        System.out.println(a4);

        //  System.out.println( 9/0 );

        System.out.println( a1+a2 );
        System.out.println( a3+a4 );


        System.out.println(  10 % 4 );
        System.out.println( 30 % 3 );




    }


}