package PracticeLoopReview;

public class PrintLetters {

    public static void main(String[] args) {

        /*
        print each character one by one in separate lines
         */
        String word ="GOOGLE";
        int count=0;
        /*
        System.out.println(word.charAt(idx));
        idx++;
        System.out.println(word.charAt(idx));
        idx++;
        System.out.println(word.charAt(idx));
        idx++;
        System.out.println(word.charAt(idx));
        idx++;
        System.out.println(word.charAt(idx));
        idx++;
        System.out.println(word.charAt(idx));
        idx++;
         */


        System.out.println("=====================");

        while (count < word.length()) {

            System.out.println(word.charAt(count));//System.out.println(word.charAt(count++));//is possible

            count++;
        }
        System.out.println("=================");

        //print each character reverse version

        int count2 = word.length() - 1;

        while (count2 >= 0) {

            System.out.println(word.charAt(count2));

            count2--;

        }

    }
}
