package day13_StringClass;


public class StringManipulations {
    public static void main(String[] args) {
        System.out.println("============charAt=============");
        String str = "Cybertek";//'t'
        //01234567

        char ch1 = str.charAt(5);//t

        System.out.println(ch1 == 'A');
        System.out.println(ch1 == 'T');
        System.out.println(ch1 == 't');

        System.out.println("============length===========");
        int totalLength = str.length();
        System.out.println(totalLength);
        System.out.println(totalLength > 250);//false

        //What is maximum index number ?
        String str2 = "Today is great day, Java is fun";
        //0123456....

        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);//length is 31 //maximum index number is 30

        System.out.println("=========concat===============");

        String s1 = "Cybertek";

        s1 = s1.concat(" School");
        System.out.println(s1);//Cybertek School

        String s2 = "Java";
        s2.concat("is a programming language");//Java is programming language
        System.out.println(s2.concat("is a programming language"));
        System.out.println(s2);
        System.out.println("=========OR =========");

        s2 = s2.concat("is a programming language");
        System.out.println(s2);
        String r1 = "Jave is fun";
        r1 = r1.concat(",and it's easy");
        System.out.println(r1);
        System.out.println("===========toLowerCase============");

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);
        System.out.println("============toUpperCase===========");

        String name2 = "cytertek cchool";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        System.out.println("=============trim=============");//removes unused spaces returns new String.

        String A1 = "       Today is a great day         ";
        System.out.println(A1);
        A1 = A1.trim();//IN ORDER TO GET RID OF UNUSED SPACES ONLY
        System.out.println(A1);



























    }



}
