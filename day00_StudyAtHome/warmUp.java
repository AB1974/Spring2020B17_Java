package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class warmUp {

    /*
    1. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				south(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList

     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 5));

        // System.out.println(Collections.frequency(numbers,1));

        // numbers.removeIf(Engin->Engin>1);

        //  System.out.println(numbers);
        //  int a =Collections.frequency(numbers,1);
        numbers.removeIf(Engin -> Collections.frequency(numbers, Engin) > 1);
        System.out.println(numbers);


        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        Collections.sort(number);
        // Collections.frequency(number, each)>1;

        number.removeIf(each -> Collections.frequency(number, each) == 1);
        System.out.println(number);


        ArrayList<Integer> rakam = new ArrayList<>();
        rakam.addAll(Arrays.asList(7, 7, 8, 8, 4, 4, 5, 6, 7, 9, 2, 3));

        rakam.removeIf(each -> Collections.frequency(rakam, each) > 1);
        System.out.println(rakam);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mehmet", "Mehmet", "Ali", "Ali", "Ayse"));

        names.removeIf(each -> Collections.frequency(names, each) <= 1);
        System.out.println(names);
        /*
       3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater

         */
        ArrayList<String> CountryNames = new ArrayList<>(Arrays.asList("New Zealand", "Venezuella", "Switzerland", "Turkey"));

        CountryNames.removeIf(each -> each.length() >= 10);
        System.out.println(CountryNames);

        /**
         * 4. write a program that can extract the special characters, digits and alphabeths from a string
         * and stores them into seperate ArrayLists of Character:
         * 			ex:
         * 				str = "ABCD123$%#@&456EFG!";
         * 				list1: {$, %, #, @, &, !}
         * 				list2: {A, B, C, D, E, F, G}
         * 				list3: {1, 2, 3, 4, 5, 6}
         */
        System.out.println("------------");



        String str3 = "ABCD123$%#@&456EFG!";
        char[] ch = str3.toCharArray();

        ArrayList<Character> list1 = new ArrayList<>();
        for(char each:ch){
            list1.add(each);
        }
        ArrayList<Character> list2 = new ArrayList<>();
        for(char each:ch){
            list2.add(each);
        }

        ArrayList<Character> list3 = new ArrayList<>();
        for(char each:ch){
            list3.add(each);
        }

        list1.removeIf(each->Character.isDigit(each)||Character.isAlphabetic(each));
        System.out.println(list1);

        list2.removeIf(each->!Character.isAlphabetic(each));
        System.out.println(list2);

        list3.removeIf(each->!Character.isDigit(each));
        System.out.println(list3);























    }

}

