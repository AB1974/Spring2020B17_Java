package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class StringtoCharRetainNumbersOnly {

    public static void main(String[] args) {
        String s = "aa!!%$#.10aa";

        char ch[] = s.toCharArray();

        System.out.println(Arrays.toString(ch));

        ArrayList<Character> str = new ArrayList<>();

        for (char each : ch) {
            str.add(each);

        }
        System.out.println(str);
        str.removeIf(each -> !Character.isDigit(each));

        StringBuilder builder = new StringBuilder(str.size());
        for (Character each : str) {
            builder.append(each);
        }

        System.out.println(builder.toString());

        System.out.println("+========different solution=====");
        String strr = "aa!!%$#.10aa";
        String ss = "";

        for (int i = 0; i < strr.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                ss += strr.charAt(i);

            }
        }
        String word1 = " Listen";
        String word2 = "silentm";
        word1=word1.trim().toLowerCase();
        word2=word2.trim().toLowerCase();

        String g = "";
        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++){

                if (word1.charAt(i)==word2.charAt(j)) {
                    g+=word1.charAt(i);
                }

                }

        }
        if(word1.length()==word2.length()) {
            if (word1.equalsIgnoreCase(g)) {
                System.out.println("yes");

            }
        }else System.out.println("no");
    }
}