package day05_Unary_ShorthandOp;

public class UnaryOperators {
    public static void main(String[] args) {
        int a =10 ;
        int b=+a;
        System.out.println(a);
        System.out.println(b);

        int a2 =-10;
        boolean result1 =a2>0;
        boolean result2=a2<2;
        System.out.println(result1);
        System.out.println(result2);

        int x1 =-10;
        int y1=-x1;

        System.out.println(y1);

        int x2 =+20;
        int y2=-x2;
        System.out.println(y2);

          //  int a = 100;
    //        ++a ; // a = 101
          //  int b=100;

            //--b ;//99

        int z =100;

        System.out.println(++z);
        System.out.println((z));

        int P =100;

        System.out.println(P++ );//100 first passes the current value
        System.out.println(P);//increases the value by 1





    }
}
