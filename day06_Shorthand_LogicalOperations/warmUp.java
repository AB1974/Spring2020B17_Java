package day06_Shorthand_LogicalOperations;

public class warmUp {
    public static void main(String[] args) {


        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        System.out.println(z);

/*

3. manually calculate the following code fragments:
                1. int a = 200//199
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                    //-200-200 * 200 % 2
                    //-200 + -40000 % 2
                    //b = -200+0
                    //b=-200


                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
                   //  z= 300 + 400 -300 * 400 + 300 /400
                   // z= 300 + 400- 120000 +300/400        //300/400=0.75 means 0 because compiler thinks as int
                   //z= 300 +400-120000+0
                   //z= 700 -120000+ 0
                   //z=-119300






 */

    }


}
