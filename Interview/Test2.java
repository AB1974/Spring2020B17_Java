package Interview;

import MixedEveryting.A;

/**
 * public static int num1=100;
 * private static int num2=200;//private
 * protected static int num3=300;
 * static int num4=400;
 */
public class Test2 extends A {

    public static void main(String[] args) {
        System.out.println(num1);
     //   System.out.println(num2);private can not go out of the class
        System.out.println(num3);
      //  System.out.println(num4);default can not go outside of the package

    }


}
