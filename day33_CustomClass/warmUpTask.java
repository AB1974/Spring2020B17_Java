package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class warmUpTask {
    /**
     * 1. write a program that can return the unique objects from a anArray List of Integers
     * Ex:
     * list: {1,1,2,3,4,5,5}  //2,3,4,
     * <p>
     * Note: 1. DO NOT use any extra arrayList
     * 2. DO NOT use any loops
     * 3. do not use any sort method
     * 4. use predicate only and collections methods only
     * Hint:   Collections.frequency() // will return the frequency
     * removeIf( frequency == 1)  can keep the unique objects in arrayList
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 5));

        list.removeIf(each -> Collections.frequency(list, each) != 1);
        System.out.println(list);
        /**
         * 2. write a program that can return the duplicated objects from a an ArrayList of Integers
         *             Ex:
         *                 list: {1,1,2,3,4,5,5}
         *                 sout(list); ==> {1,1,5,5};
         *         Note: 1. DO NOT use any extra arrayList
         *               2. DO NOT use any loops
         *               3. DO NOT use any sort method
         *               4. Use predicate and collections methods only
         */
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 5));

        list1.removeIf(each -> Collections.frequency(list1, each) == 1);
        System.out.println(list1);
        System.out.println(new LinkedHashSet<>(list1)); //[1,5]

/**
 * 3. write a program that can extract the special characters,
 * digits and alphabets from a string and stores them into separate ArrayLists of Character:
 *             ex:
 *                 str = "ABCD123$%#@&456EFG!";
 *                 list1: {$, %, #, @, &, !}
 *                 list2: {A, B, C, D, E, F, G}
 *                 list3: {1, 2, 3, 4, 5, 6}
 *         DO NOT USE LAMBDA
 */
        String str = "ABCD123$%#@&456EFG!";
        char arr[] = str.toCharArray();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (char each : arr) {

            if (Character.isLetter(each)) {
                letters.add(each);
            } else if
            (Character.isDigit(each)) {
                digits.add(each);
            } else {

                specialChars.add(each);
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);
        System.out.println("========second method=============");
        String str1 = "ABCD123$%#@&456EFG!";
        char arr1[] = str.toCharArray();
        ArrayList<Character> letters1 = new ArrayList<>();
        ArrayList<Character> digits1 = new ArrayList<>();
        ArrayList<Character> specialChar1 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (Character.isLetter(each)) {
                letters1.add(each);
            } else if
            (Character.isDigit(each)) {
                digits1.add(each);
            } else {

                specialChar1.add(each);
            }

        }
        System.out.println(letters1);
        System.out.println(digits1);
        System.out.println(specialChar1);

        System.out.println("========third method=============");
        //Array list does not support primitives(char) but it supports (Character)//
        String str3 = "ABCD123$%#@&456EFG!";

        char[] arr3 = str3.toCharArray();
        Character[] ch = new Character[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            ch[i] = arr3[i];
        }

        ArrayList<Character> letters3 = new ArrayList<>(Arrays.asList(ch));
        letters3.removeIf(each -> !Character.isLetter(each));

        ArrayList<Character> digits3 = new ArrayList<>(Arrays.asList(ch));
        digits3.removeIf(each -> !Character.isDigit(each));

        ArrayList<Character> specialChar3 = new ArrayList<>(Arrays.asList(ch));
        specialChar3.removeAll(letters3);
        specialChar3.removeAll(digits3);

        System.out.println(letters3);
        System.out.println(digits3);
        System.out.println(specialChars);


    }

}
