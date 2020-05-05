package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseAllllllllllllll {

    public static void main(String[] args) {

        System.out.println("=====How to reverse String?===============");

        String name = "Aylin";

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse += name.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("===== reverse Integer?First Solution========");

        int num = 12345;
        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num % 10;//54321
            num = num / 10;

        }
        System.out.println("Reverse num: is " + rev);

        System.out.println("=====reverse Integer?Second Solution=======");

        int numb = 12345;

        String ters = String.valueOf(numb);

        StringBuffer buffer = new StringBuffer(ters);
        System.out.println(buffer.reverse());

        //System.out.println(new StringBuffer(String.valueOf(numb)).reverse());


        System.out.println("=====reverse String Array=========");

        String[] names = {"John", "Aaron", "Aylin"};
        String[] namesRev = new String[names.length];
        int k = names.length - 1;
        for (int i = 0; i < names.length; i++) {
            namesRev[i] = names[k];
            k--;
        }
        System.out.println(Arrays.toString(namesRev));

        System.out.println("=====reverse int Array=========");

        int[] number = {1, 2, 3, 4, 5};
        int reversedNum[] = new int[number.length];
        int l = number.length - 1;
        for (int i = 0; i < number.length; i++) {
            reversedNum[i] = number[l];
            l--;

        }
        System.out.println(Arrays.toString(reversedNum));

        System.out.println("=====reverse Integer ArrayList=========");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> revNumbers = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {

            revNumbers.add(numbers.get(i));

        }
        System.out.println(revNumbers);


    }
}
