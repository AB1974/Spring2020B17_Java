package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {

        //post a++
        int a =20;
        System.out.println(a++);
        System.out.println(a);//a become 21

        int b = 30 ;
        int c =b--;//c =30 ,b=29
        System.out.println(c);
        System.out.println(b);

        int d =40;
        int e=d++;
        System.out.println(e);
        System.out.println(d);

        //pre ++a

        int x =200;
        System.out.println(--x);//x will be 199
        System.out.println(x);


        int z =100 ;
        z=z++ + --z - z-- + ++z;
        //z=100+100-100+100
        //z=200

        System.out.println(z);

        int u = 900;
        int r = - ++u+ ++u +-u++;
        System.out.println(r);

    }
}
