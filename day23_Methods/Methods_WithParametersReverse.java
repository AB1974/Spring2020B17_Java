package day23_Methods;


public class Methods_WithParametersReverse {


    //create a function that can reverse any string.
    //we need a parameter!We need to know string

    public static void main(String[] args) {
        String name = "Aylin";

        ReverseString(name);
        String name2 = "Cybertek School";
        ReverseString(name2);


    }


    public static void ReverseString(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));
        }
        System.out.println();

    }


}
