package Interview;

import java.util.Arrays;
import java.util.Collections;

public class FrewuencyOfCharacters {

    /**
     * Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        String str = "AAABBCDDBBAA";
        String result = "";
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {

            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += str.charAt(i);

        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }
        System.out.println(result);
    }
}
