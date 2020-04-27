package Resources;

import java.util.*;

public class Library {
    public static int[] sortDesending(int[] arr) {
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }

    public static String Reverse(String str) {  // can reverse a string and returns string
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;
    }

    // remove duplicates from string
    // Frequency of string
    // merge two array and return third one
    // max number from array
    // min number from array
    public static String RemoveDuplicates(String str) {
        String result = "";      //AB
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //B
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }

    public static int Frequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }

    public static String FrequencyOfChars(String str) {
        String NonDup = Library.RemoveDuplicates(str);             //ABC
        String result = ""; //contains the frequency of chars
        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//  "A"
            int num = Library.Frequency(str, ch);
            result += ch + num;
        }
        return result;
    }

    public static int Frequency(String str, char ch) {//how many times this cars occurres in the string

        char[] charr = str.toCharArray();//{A, A, A}
        int count = 0;
        for (char each : charr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    public static String Uniques(String Str) {

        String result = "";

        for (int i = 0; i < Str.length(); i++) {

            int num = Frequency(Str, Str.charAt(i));
            if (num == 1) {
                result += Str.charAt(i);
            }
        }
        return result;
    }

    public static int minimum(int[] arr) {
        int minimum = arr[0];
        for (int each : arr) {

            if (each < minimum) {
                minimum = each;
            }

        }
        return minimum;
    }
    public static int max(ArrayList<Integer> list) {//Integer Array List Method
        int maximum = Integer.MIN_VALUE;//just an assumption
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > maximum) {
                maximum = list.get(i);


            }
        }
        return maximum;
    }


}