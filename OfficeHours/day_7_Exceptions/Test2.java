package OfficeHours.day_7_Exceptions;

public class Test2 {
    public static void main(String[] args) {

        // &     &&

        // |     ||

        System.out.println(false & true);

        int one = 0;

        System.out.println(one++ > 0 && ++one > 0);
        System.out.println(one);

        int two = 2;
        System.out.println( two == 2 || 3/0 == 0 );

        int three = 3;

        System.out.println(three-- == 3 & 3/3 == 1);

        // i , i +1  i
    }
}
