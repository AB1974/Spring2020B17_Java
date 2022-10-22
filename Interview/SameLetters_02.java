package Interview;

import java.util.*;

public class SameLetters_02 {

    public static void main(String[] args) {
        String str1 = "ABCCCBDEEF";

        String str2 = "ABCCCBDEEF";

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";
        for (char each : ch1)

            a1 += each;

        for (char each : ch2)

            a2 += each;

        System.out.println(a1.equals(a2));

    }

}

