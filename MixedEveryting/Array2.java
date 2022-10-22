package MixedEveryting;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {

//How you create an arrray?

        int numbers[] = new int[]{3, 1, 8, 5};

        int numbers1[] = new int[3];
        numbers1[0] = 3;
        numbers1[1] = 7;
        numbers1[2] = 9;

        int[] numbers2 = {1, 3, 5, 7};


        System.out.println(Arrays.toString(numbers1));

        Arrays.sort(numbers);//1,3,5,8
        System.out.println(Arrays.binarySearch(numbers, 5));//give index no which is 2

        System.out.println("===============");

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int each : num) {
            System.out.print(each);//prints item
        }
        System.out.println();

        System.out.println(Arrays.toString(num));//prints as an array

        String[] str = {"John", "Adam", "Don"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));


    }
}

