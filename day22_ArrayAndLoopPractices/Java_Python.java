package day22_ArrayAndLoopPractices;

public class Java_Python {

    public static void main(String[] args) {
        /*
            3. write a program that can return the number of appearances of "java" and "python"
             anywhere in the sentence
                (it's similar to the task 97 in replit, But this time you MUST use arrays and for each loop)
         */

        String sentence = "I like java and javascript python python";
        sentence=sentence.toLowerCase();
        int countJava = 0;
        int countpython = 0;

        String[] words = sentence.split(" ");//[I, like  ,Java ,and ,javascript]

        for (String each : words) {

            if (each.contains("java")) {
                countJava++;

            }
            if (each.contains("python")) {
                countpython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countpython);
        System.out.println(countJava == countpython);

    }
}
