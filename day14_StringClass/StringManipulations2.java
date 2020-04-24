package day14_StringClass;



public class StringManipulations2 {

    public static void main(String[] args) {

        System.out.println("==============empty========returns boolean ");

        String str = "";
        boolean bool1 = str.isEmpty();//true string is empty
        System.out.println(bool1);

        String str1 = " ";
        boolean bool2 = str1.isEmpty();//false because there is a space

        System.out.println(bool2);

        String userName = "";
        if (userName.isEmpty()) {

            System.out.println("enter your user name first!");
        }

        System.out.println("===========equals ============");

        String s1 = "Cat";
        String s2 = new String("Cat");

        System.out.println((s1 == s2));//false

        System.out.println(s1.equals(s2));//true

        String z1 = "Tiger";

        String z2 = new String("Tiger");

        String z3 = "Tiger";

        String z4 ="tiger";

        //==
        System.out.println(z1 == z2);//false

        System.out.println((z2 == z3));//false

        System.out.println((z1 == z3));//true

        //equals (checking visible of two strings

        System.out.println(z1.equals(z2));//true
        System.out.println(z2.equals(z3));//true
        System.out.println(z1.equals(z3));//false
        System.out.println(z3.equals(z4));///false







    }
}
