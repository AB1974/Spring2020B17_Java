package day17_WhileDoWhileLoop;

public class FrequencyTest {

    public static void main(String[] args) {

        String str = "Cybertek School is a great place to study".toLowerCase();  //  is fun is cool

        int count = 0 ;

        String word = "s".toLowerCase();  // ignoring the case sensitiveity by converting both string to lowercase

        while(str.contains(word)){

            count++;
            str = str.replaceFirst(word, ""); // after counting the first "Java",w e need to rmeove it from the str

        }


        System.out.println(count);


    }

}

