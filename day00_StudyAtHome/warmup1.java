package day00_StudyAtHome;

import java.util.Arrays;

public class warmup1 {

    public static void main(String[] args) {
       /*
        1.  write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods

         */

        String str = "aabbc";
        String result = "";
        for (int j = 0; j <= str.length() - 1; j++) {

            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {  // if unique
                result += str.charAt(j);
            }

        }
        System.out.println(result);







        String[] kk = str.split("");
        System.out.println(Arrays.toString(kk));
        String str2 = "cab";
        String[] nn =str2.split("");
        System.out.println(Arrays.toString(nn));

            //for(int i=0 ;i<kk.length);


    }
}
//abc
//cab