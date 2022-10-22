package day52_CollectionFramework_Intro;

import java.util.ArrayList;

public class null_Keyword {

    //  static String str ;//null
    static String str = new String("Cybertek");
    //reference type is non primitive

    static ArrayList<Integer> list;

    public static void main(String[] args) {

        //   System.out.println(str.charAt(0));//default value is null,
        //it gives you NullPointerException
        System.out.println(str.charAt(0));//c

        //   System.out.println(list.get(1));//null.if you do not instantiate

        //  WebElement element=null;
        String str2 = null;
        Integer i1 = null;
        //   int num=null; you can not assign to primitives! only non primitives

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(null);
        System.out.println(list1);

        //Hashset accepts null
        //TreeSet does not accept null

        System.out.println("==============================");
        String number = "123";

        int num1 = Integer.parseInt(number);

        System.out.println(num1);

        System.out.println("===============================");
        String[] arr = {null, "Cybertek", "ABC"};
        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
        name1 = null;
        // name1 =  name1.toLowerCase();

        System.out.println(name1);


    }
}
