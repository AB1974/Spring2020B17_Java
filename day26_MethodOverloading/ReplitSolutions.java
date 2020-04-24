package day26_MethodOverloading;

import java.util.Arrays;

public class ReplitSolutions {


    public static int count_appearance(String[] arr, String t) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(t)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr1 = {"art", "art", "door", "red"};
        String s = "art";
        int num = count_appearance(arr1, s);
        System.out.println(num);
    }

}

