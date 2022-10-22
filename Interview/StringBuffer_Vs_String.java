package Interview;

public class StringBuffer_Vs_String {

    public static void main(String[] args) {
        String x = "ABC";
        String y = "TECH";
       x= x.concat(y);
        System.out.println(x);//abc
        //String Builder is mutable

        StringBuilder a = new StringBuilder("ABC");
        StringBuilder b = new StringBuilder("TECH");
        a.append(b);
        System.out.println(a);
        StringBuffer c = new StringBuffer("ABC");
        StringBuffer d = new StringBuffer("TECH");
        c.append(d);
        System.out.println(c);//ABCTECH
    }
}
