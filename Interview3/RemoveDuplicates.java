package Interview3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicates {
   // String str="AAABBBCCC";

    public static String removedup(String str){

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;
    }

    public static void main(String[] args) {
        System.out.println(removedup("AAABBBCCC"));
    }


}
