package day13_StringClass;

//import java.lang.String;//not necessary all the class in "java.lang"package important automaticially
public class StringLiterals {

    public static void main(String[] args) {

        String str1 = "Cat";//string literal//string pool
        String str2 = new String("Cat");//Java Heap

        System.out.println((str1 + " : " + str2));
        System.out.println(str1 == str2);//they are two different object

        String str3 = "Cat";//string pool/those cat same object one memory location which is string pool
        System.out.println(str1 == str3);//true //same object "cat"
        String str4 = new String("Cat");//st2 str4 are two independent object .
        System.out.println(str2 == str4);


        String s1 = "Java"; //it goes to string pool//it's immutable we can not modify it.
        System.out.println(s1);//java
        s1 = "JavaScript";
        System.out.println(s1);//javascript
        String s2 = "Java";//no new object will be created in string pool

        System.out.println(s1 == s2);
        //          javascript!=java they are not equal

        //index number //
        String str = "Cybertek";
        //index:  =01234567..

        String str5 = "Cat Dog";
        //index:     0123456//index number

        //
        System.out.println("========String Manipulations=========");
        String one = "Cybertek1";
        String two = "Cybertek";
        String three = "Cybertek";
        String four = "Cybertek";
        String five = "Cybertek";

        System.out.println(one+two+three+four+five);

    }
}
