package daysmt_collectionsmuradil;

import java.util.*;


public class Vectorexample {
    public static void main(String[] args) {
        List<String> v = new Vector<>();

        v.add("cool");
        v.add("woodenspoon");
        v.add("water");
        v.add("green tea");
        v.add("green tea");
        System.out.println("=========");
        v.remove("green tea");


        for (String str:v){

            System.out.println(str);

        }
      //  System.out.println(v.size());
        System.out.println(v.get(3));
    }
}
