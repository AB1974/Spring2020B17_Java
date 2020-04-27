package day00_StudyAtHome;

public class replit169 {
    /*
This method gets a string and returns the word count of that string.
wordCount("foo bar") returns2
wordCount("one two three")returns3
     */
    public static void main(String[] args) {

        int count = wordCount("one two three");

        System.out.println(count);
    }

    public static int wordCount(String words) {

        String[] words1 = words.split(" ");

        return words1.length;
    }


}

