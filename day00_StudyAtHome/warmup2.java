package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmup2 {

    public static void main(String[] args) {

        //1. write a program that can return the unique objects from a anArray List of Integers

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 5));

        numbers.removeIf(each -> Collections.frequency(numbers, each) > 1);
        System.out.println(numbers);


        //2.write a program that can return the duplicated objects from a an ArrayList of Integers

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        number.removeIf(each -> Collections.frequency(number, each) == 1);
        System.out.println(number);

         /*
       3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater

         */
        ArrayList<String> CountryNames = new ArrayList<>(Arrays.asList("New Zealand", "Venezuella", "Switzerland", "Turkey"));

        CountryNames.removeIf(each->each.length()>=10);
        System.out.println(CountryNames);

        /*
        4. write a program that can extract the special characters,
        digits and alphabets from a string and stores them into separate ArrayLists of Character:
         */

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
