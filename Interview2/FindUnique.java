package Interview2;

import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String result = "";

        for (String each : str.split(""))

            result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";

        System.out.println(result);

        System.out.println("==============================");
        String[] arr = str.split("");

        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {

            int num = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(arr[j]))

                    num++;

            }

            if (num == 1)

                unique1 += arr[j];

        }

        System.out.println(unique1);

    }
}





