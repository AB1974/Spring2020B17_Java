package Interview;

import java.util.Scanner;

public class paragraphstring {

    public static void main(String[] args) {
        String s = "A paragraph is a series of related sentences developing a central idea, " +
                "called the topic. Try to think about paragraphs in terms of thematic " +
                "unity: a paragraph is a sentence or a group of sentences that supports " +
                "one central, unified idea. Paragraphs add one idea at a time to your broader argument.";

        Scanner scan = new Scanner(s);
        String str="";
        while (scan.hasNext()){
          String trt  =scan.next();
            str += trt.toUpperCase().substring(0,1)+trt.toLowerCase().substring(1)+" ";

        }
        System.out.println(str);
    }
}