package MixedEveryting;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        byte b = 20;
        short s = 10;

        int s1=b+s;
        System.out.println(s1);

        byte size=127;//max
        double d=456;//456.0
        float f=23.9f;
        int age =45;
        long lo=2345l;
        System.out.println(d);
        System.out.println(f);
        System.out.println(lo);

        int i=(int)3.9;//we use casting
        System.out.println(i);

        int minutes=315;
        int hours=minutes/60;
        System.out.println(hours);
        minutes%=60;
        System.out.println(minutes);



    }
}
