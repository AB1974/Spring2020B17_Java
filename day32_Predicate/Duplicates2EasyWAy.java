package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2EasyWAy {

    public static void main(String[] args) {
          /*
        write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
         */

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));//[A D] are duplicated objects
        System.out.println(list);
        ArrayList<String> result = new ArrayList<>();

        //Collections.frequency(Collection type,object)

        for (String each : list) {

            int count = Collections.frequency(list, each);
            if (count > 1) {
                if (result.contains(each)) {
                    continue;//if element zaten result icindeyse ekleme demek !yani skip et
                }
                result.add(each);
            }

        }

        System.out.println(result);
        /*
        int count = Collections.frequency(list, list.get(0));
        if (count > 1) {
            result.add(list.get(0));*/

        System.out.println("==============FOR LOOP ILE=============");

        for (int i = 0; i < list.size(); i++) {

            int count = Collections.frequency(list, list.get(i));
            if (count > 1 && !result.contains(list.get(i))) {
                result.add(list.get(i));

            }

        }
        System.out.println(result);

    }

}



