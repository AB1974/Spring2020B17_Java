package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        System.out.println("========indexOf==============");

        String str = "I like to learn Java. I like to watch the movie Jumanji";

        int a1 = str.indexOf("J");//index number returns to number (int )

        System.out.println(a1);//first matching J

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I") + 1;
        System.out.println(a3);
        System.out.println("==========LastIndexOf==============");
        //returns the index number of last occur character

        String s = "I like Java ,and I like reading";
        int b1 = s.lastIndexOf("I");
        System.out.println(b1);

        int b2=s.lastIndexOf("i");
        System.out.println(b2);

        String z = "I like C#, C# is cool";
        int c1 =z.lastIndexOf("C");
        System.out.println(c1);
        String x ="I like Java, Java is fun, Java programming is fun";

        int d1=x.indexOf("Java is");

        System.out.println(d1);

        int d2 =x.indexOf(", J")+2;//why we add 2 because if we don't add 2 it gives index number of coma(,)
        System.out.println(d2);

        int d3 =x.lastIndexOf("J");

        System.out.println(d3);

        int d4 = x.indexOf("Java p");
        System.out.println(d4);

        char ch1= x.charAt(26);
        System.out.println(ch1);
    }
}
