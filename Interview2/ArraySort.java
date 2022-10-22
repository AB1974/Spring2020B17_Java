package Interview2;

import java.util.Arrays;

public class ArraySort {


    public static void main(String[] args) {
        int[] num = {1, -3, -30, 40, 0, 12};


        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {

                if (num[i] < num[j]) {
                    int temp = num[i];

                    num[i] = num[j];

                    num[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(num));
    }
}