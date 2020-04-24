package day26_MethodOverloading;

public class Uniques {

    /*
    2. use the above method to create another called uniques that accepts a string parameter and returns
	it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
     */

    public static void main(String[] args) {
        String Str = "ABBCDD";//A IS UNIQUE
        String result = "";

        for (int i = 0; i < Str.length(); i++) {

            int num = Frequency(Str, Str.charAt(i));
            if (num == 1) {
                result += Str.charAt(i);
            }

        }
        System.out.println(result);
        String str2 = "Cybertek";
        String result2 = Uniques(str2);
        System.out.println(result2);

    }

    public static String Uniques(String Str) {

        String result = "";

        for (int i = 0; i < Str.length(); i++) {

            int num = Frequency(Str, Str.charAt(i));
            if (num == 1) {
                result += Str.charAt(i);
            }
        }
        return result;
    }


    public static int Frequency(String str, char ch) {//how many times this cars occurres in the string

        char[] charr = str.toCharArray();//{A, A, A}
        int count = 0;
        for (char each : charr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

}
