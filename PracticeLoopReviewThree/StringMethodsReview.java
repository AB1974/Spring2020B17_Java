package PracticeLoopReviewThree;

public class StringMethodsReview {

    public static void main(String[] args) {

        /*
        Given a String word,print out unique characters from the word.
        examples:"wooden spoon" ,"java",aabbccddef,
                 :wooden spoon/ you' ll have 1 character each letter
                 :jav
                 :abcdef
         */
        String word = "javva";

        String unique = "";

        char ch = word.charAt(0);

        System.out.println(unique.contains("" + ch));//we checked if j  is in unique word!
        if (!unique.contains("" + ch)) {
            unique += ch;
            System.out.println(unique);

        }

        if (unique.indexOf(ch) == -1) {
            unique += ch;

        }
        System.out.println("=====================");

        String word2 = "bananas";
        String unique2 = "";
        int i = 0;
        char ch2 = word2.charAt(i);
        System.out.println("Ch2:" + ch2);

        i = 1;
        ch2 = word2.charAt(i);
        System.out.println("Ch2:" + ch2);
        i++;
        ch2 = word2.charAt(i);
        System.out.println("Ch2:" + ch2);



    }
}
