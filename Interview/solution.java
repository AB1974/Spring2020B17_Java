package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class solution {


    //  Write a return method that can find the frequency of characters
    // Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    //        */
    public static String frequency(String str) {
        String result = "";
        String[] arr = str.split("");
        LinkedHashSet<String> list = new LinkedHashSet<>(Arrays.asList(arr)); //"A" "B""C""D"
        int freq = 0;
        for (String each : list) {
            freq = Collections.frequency(list,each);
            freq++;
            result += each + "" + freq;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(frequency("AAABBCDD"));
    }




}