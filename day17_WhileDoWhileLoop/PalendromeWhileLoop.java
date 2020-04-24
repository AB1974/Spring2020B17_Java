package day17_WhileDoWhileLoop;

public class PalendromeWhileLoop {

    public static void main(String[] args) {


            String str = "Anna";

            String reversedStr = "";  // store the reversed version of str

            int index =  str.length()-1;  // last index number

            while(index >=  0){
                reversedStr  += str.charAt(index);

                index--;
            }

            boolean palindrome = reversedStr.equalsIgnoreCase(str);

            System.out.println(palindrome);


    }



    }

