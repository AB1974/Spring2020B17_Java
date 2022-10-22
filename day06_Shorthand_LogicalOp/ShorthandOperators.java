package day06_Shorthand_LogicalOp;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x =20 ;

        x += 10;  // x=x +10 =30

        System.out.println(x); //30

        x += 60 ;  // x=x+60 x=90
        System.out.println(x);

        String schoolname ="Cybertek";
        schoolname+=12345; //schoolname =schoolname +12345
        System.out.println(schoolname);

        System.out.println('a'+'b');
        //                  97+98==> 195

        char ch1 ='a';//97
        ch1+='b';//98
        //char ch1= 195;
        System.out.println(ch1); //character

        int num ='z'; //z 122 in aski table
            num+='x';//num=num+120
                    // num =122+120
        System.out.println(num);

        int A =100;
        A-=90;
        System.out.println(A);//A=10

        int B =200;
        B -=A ;
        System.out.println(B);

        int a =2;
        a*=3;
        System.out.println(a);
        int b = a*=10;
        System.out.println(b);

        int a1 =100;
        int b1=(a1*=2) + ++a1;
        System.out.println(b1);

        int x1=10;
        int y =x1+=10*2;//X1=X1+20
        System.out.println(y);

        int q =20;
        int p =q*=20*3;
        System.out.println(p);
        //q*=60 //q=q*60

        int num2=400;
        num2/=20+10; //num2 =num2/30
        System.out.println(num2);
        //num2=400/30 13.123 by default it will be taken as int number which is 13 .

        int num3= 300;
            num3%=10+20;
            num3%=30;
        System.out.println(num3);//num3=num3%30 num3=300%30 ==>0

        int n1 =400;
            n1%=3*5; //n1%=15
                    //n1=n1%15
                    //n1=400%15

        //400/15 =26.666
        //%reminder=400 -(15*26)=10

        System.out.println(n1);










    }

}
