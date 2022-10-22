package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques_04 {

    public static void main(String[] args) {

        String str = "ABCDDEFABE";

        String unique = "";

        for (String each : str.split("")) {

            unique += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";
        }
        System.out.println(unique);


        System.out.println("==2.yol ===========");

        String str1 = "ABCDDEFABE";

        char[] ch = str1.toCharArray();
        ArrayList<Character> letter = new ArrayList<>();

        for (char each : ch) {
            letter.add(each);
        }

        letter.removeIf(p -> Collections.frequency(letter, p) > 1);
        System.out.println(letter.toString());

    }
}
