package day02_Variables;

public class Variables {

    public static void main(String[] args) {
        System.out.println("Length is: 10");
        System.out.println("Width is: 20");




        byte l = 100;
        byte w = 20;
        System.out.println(l);
        System.out.println(w);

        //  byte l1 = 128;  out of the range

        short s1 = 4000;

        // short s2 = 100000; out of the range


        int a = 100000;

        long b = 9999999999999999l;
        long c = 999999999999999999L;

        System.out.println(9999999999l);

        System.out.println(10000000000L);


        byte byteNum = 100;
        short shortNum = byteNum;

        //   byte byteNum2 = shortNum;

        int intNum = shortNum;

        // GDP: 0.035
        double decimalNum = 0.5;
        float decimalNum2 = 0.5f;
        System.out.println(0.5 );

        System.out.println("===========================================");

        int intnumber = 100;
        float floatnumber = intnumber;
        double doublenumber = floatnumber;

        System.out.println(intnumber);  // 100
        System.out.println(floatnumber);  // 100.0
        System.out.println(doublenumber);  // 100.0

        int A123 = 10000;
        //  int A123 = 1000000;   variable name MUST be unique
        int num_ = 1000;
        int num$ = 2000;
        // int num% = 3000;
        // int abstract = 4000;
        // int boolean = 9000;




    }
}
