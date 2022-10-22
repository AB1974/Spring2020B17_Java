package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class reversedarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        System.out.println(reverse);

        String str="Hello";
        str=str.concat("engin");
        System.out.println(str);
        System.out.println();
    }

}

