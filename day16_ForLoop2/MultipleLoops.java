package day16_ForLoop2;

public class MultipleLoops {

    public static void main(String[] args) {

        String upperCase = "";//A,Z
        String lowerCase = "";//a,z

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            upperCase += ch;
        }

        System.out.println(upperCase);

        for (char ch = 'a'; ch <= 'z'; ch++) {

            lowerCase += ch;
        }
        System.out.println(lowerCase);

        //Aa Bb Cc
        String result = "";

        for (int i = 0; i <= upperCase.length() - 1; i++) {

            result += "" + upperCase.charAt(i) + lowerCase.charAt(i) + " ";

        }
        System.out.println(result);
        System.out.println('a'+""+'b');

        System.out.println("========SECOND SOLUTIONS=============");

        int a = 97;
        int A = 65;

        String result2 ="";
        for(int i =0 ; i < 26; i++ ){
            char ch = (char)(A +i);  // upper case characters
            //          65
            char ch2 = (char)(a +i);
            //                97+0

            result2 += ch + "" +ch2+" ";
        }

        System.out.println(result2);


    }
}
