package day26_MethodOverloading;

public class Frequency {

    /*
    Aylin Bekem
    Engin Bekem
    Arin Bekem
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop

     */
    public static int frequency(String str, char ch) {//how many times this cars occurre in the string

        char[] charr = str.toCharArray();//{A, A, A}
        int count = 0;
        for (char each : charr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int num = frequency("AABBBBBCC", 'B');
        System.out.println(num);

    }


}
