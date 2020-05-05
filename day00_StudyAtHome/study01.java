package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class study01 {

    public static void main(String[] args) {
        //et ile bitenleri sil.
        String[] names = {"Ahmet", "Engin", "Aylin", "Samet"};

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Ahmet", "Engin", "Aylin", "Samet"));

        name.removeIf(each -> each.endsWith("et"));
        System.out.println(name);

        name.removeIf((each -> each.startsWith("E")));
        System.out.println(name);


        /**
         * list:  {1,0,2,0,3,0,4,0};
         *
         *move zeros
         *
         *
         */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int count = Collections.frequency(numbers, 0);
        numbers.removeIf(each -> Collections.frequency(numbers, each) > 1);
        System.out.println(numbers);

        for(int i=0;i<count;i++){
            numbers.add(0);

        }
        System.out.println(numbers);

    }
}

