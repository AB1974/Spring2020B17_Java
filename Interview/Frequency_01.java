package Interview;

import java.util.Arrays;
import java.util.Collections;

public class Frequency_01 {

    public static void main(String[] args) {
        String str = "ABCDDDEEFABE";

        String nonDup = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.substring(i, i + 1))) {
                nonDup += str.substring(i, i + 1);

            }
        }
        for (int i = 0; i < nonDup.length(); i++) {

            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }
        System.out.println(result);
    }
}