package Interview;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringArrayList {

    public static void main(String[] args) {
        String input = "Geeks For Geeks";
        String reverse = "";
        ArrayList<Character> arrList = new ArrayList<>();

        for (char each : input.toCharArray()) {
            arrList.add(each);
        }
        Collections.reverse(arrList);

        Object[] arr2 = arrList.toArray();

        for (int i = 0; i < arr2.length; i++) {
            reverse += arr2[i];
        }
        System.out.println(reverse);
    }
}
