package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";//string

        Integer a = Integer.valueOf(str);//returns you wrapper class.
        //wrapper class    //   wrapper class

        System.out.println(a);

        double b = Integer.valueOf(str); //with valueOfMethods you can assign any wrapper class to any primitives

        System.out.println(b);

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);//15.5
        //double=double//none

        double d2 = Double.valueOf(str2);//15/5
        //double=Double//unboxing

        System.out.println(d1 == d2);//basically they give you same method.

        int z1 = 2000;
        //Long L1=z1;//it does not accept because Long wrapper class takes only Long primitives!

        Short sh1 = 3000;
        int z2 = sh1;//this words because int is primitive  is not a wrapper class!

        /*
        "true"
        "false"===>boolean
        "1000000000.5"===>float
        "123456"===>short

         */
        String s1 = "true";
        String s2 = "false";
        String s3 = "1000000000.5";
        String s4 = "123456";

        boolean b1 = Boolean.parseBoolean(s1);
        boolean b2 = Boolean.parseBoolean(s2);
        float f1 = Float.parseFloat(s3);
        short sho1 = (short)Integer.parseInt(s4);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(f1);
        System.out.println(s4);

        System.out.println("===========");

        boolean t1=Boolean.valueOf(b1);
       // boolean==Boolean//unboxing
        System.out.println(t1);

        System.out.println("=============");

        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);//max int value:2147483647

        Double maxNum2=Double.MAX_VALUE;//1.7976931348623157E308
        System.out.println(maxNum2);

        int minNum=Integer.MIN_VALUE;//-2147483648
        System.out.println(minNum);

        byte maxNum1=Byte.MAX_VALUE;//127
        System.out.println(maxNum1);

        byte minNUm1=Byte.MIN_VALUE;
        System.out.println(minNUm1);//-128

        boolean [] arr = new boolean[3];
        System.out.println(Arrays.toString(arr));


        //all of wrapper class' default values are null,

        Character[] arr1=new Character[3];
        System.out.println(Arrays.toString(arr1)); //null,null,null
        Integer [] arr3 =new Integer[3];
        System.out.println(Arrays.toString(arr3));//null,null,null

        int[] number=new int[3];
        System.out.println(Arrays.toString(number));//0,0,0

        boolean[] bool1=new boolean[3];
        System.out.println(Arrays.toString(bool1));//false,false,false

        Boolean[] bool2=new Boolean[3];//wrapper class
        System.out.println(Arrays.toString(bool2));

    }
}
