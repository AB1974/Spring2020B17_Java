package MixedEveryting;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    /**
     * 5) Create a method that will accept an ArrayList of Strings
     * and return the String that has the biggest length
     */


    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(Arrays.asList("House","Car","Window","Practice"));
        System.out.println(returnString(str));


    }

    public static String returnString(ArrayList<String>list){

        String biggest="";
        for(String each:list){

            if(each.length()>biggest.length()){
                biggest=each;
            }
        }
        return biggest;
    }

}
