package Interview;

import java.util.Arrays;

public class reverseString {

    public static void main(String[] args) {

        String str="aylin bekem";

        String reverse="";

        for (int i=str.length()-1;i>=0;i--) {
            reverse += ""+str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("============");

       StringBuilder obj=new StringBuilder(str);
        System.out.println(obj.reverse());
       System.out.println(obj.append(" Aylin Bekem "));


        System.out.println("=========");

      String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        System.out.println("===================");

        str=str.substring(0,1).toUpperCase()+str.substring(1,6)+str.substring(6,7).toUpperCase()+str.substring(7);
        System.out.println(str);

        StringBuilder obj2 =new StringBuilder("Alex");
        obj2.append("ander ");
        obj2.append(" the ");
        obj2.append(" Great ");
        System.out.println(obj2);

    }
}
