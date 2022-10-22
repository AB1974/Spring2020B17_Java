package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMinFromAnArray {

    public static void main(String[] args) {
        int[] n = {1, 31, 4, -7, 29};

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);

        System.out.println("============");

        ArrayList<Integer> minl = new ArrayList<>();

        for (int each : n) {
            minl.add(each);
        }
        Collections.sort(minl);
        System.out.println(minl.get(0));

        System.out.println("================");

        Arrays.sort(n);
        for (int i=0;i<n.length;i++)
        {

        }
        System.out.println(n[0]);

        }
    }

