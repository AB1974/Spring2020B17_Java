package OfficeHours.Practice_03_18_2020;

public class ShortHandOperators_Practice {

    public static void main(String[] args) {
        // +=:addition assignment
        int a = 100;
        //a=a+200;
            a +=200;//a=300
        System.out.println(a);
        a+=200*3;//a=900
        System.out.println(a);

        // -= subtraction assignment

        a -=400;
        System.out.println(a);

        int x= 5;

        x *=3;//x=x*3=15
        System.out.println(x);

        x *=2+1;//x is 15
        System.out.println(x);

        int n =900;
        //n=n/3 ;

        n/=3;
        System.out.println(n);// n=n/3 === n/=3

        n/=3*5;//n=n/15 =20
        System.out.println(n);

        //numerator-(denominator*whole number for result)
        //10 / 3 = 3.33333;
         //remainder =10-(3*3)
        //remainder =1

        int m =10;
        m %=3; //m=1
        System.out.println(m);

        int y=300;
        y %= 3*5;
        System.out.println(y);

        int t = 400;
        t%=10*2;
        System.out.println(t);







    }
}
