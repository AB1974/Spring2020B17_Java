package day19_Arrays;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {

    public static void main(String[] args) {

        String str = "AABBCC";
        String result = "";
        String nonDup = "";


        for (int i = 0; i < str.length(); i++)

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);

        for (int i = 0; i < nonDup.length(); i++) {
//     String [] mm = str.split("");
            //Collection.frequency(mm,a
            int num = Collections.frequency(Arrays.asList(str.split("")), nonDup.substring(i,i+1));

            result += "" + nonDup.charAt(i) + num;

        }

        System.out.println(result);

    }
}