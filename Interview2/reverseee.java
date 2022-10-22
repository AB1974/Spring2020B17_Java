package Interview2;

public class reverseee {

    public static String reverseString(String arg) {

        String reverse = "";
        for (int i = 0; i < arg.length(); i++)

            reverse += arg.charAt(arg.length()-1);

        return reverse;

    }

    public static void main(String[] args) {


        reverseee.reverseString("apple");

    
    }
}