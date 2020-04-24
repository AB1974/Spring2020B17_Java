package day25_MethodsRecap;
/*
warmup task:
	1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
	2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
	3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */
public class RemoveDuplicates_String {

    //==============REMOVE THE DUPLICATES===============
    public static void main(String[] args) {

        String str = "ABABAAFFKKFFFF";
        String result = "";//AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//B
            if (!result.contains("" + ch)) {//we concate to empty string
                result += ch;
            }
        }

        System.out.println(result);

        String str2="ABCABCABC";
        String result2=RemoveDuplicates(str2);
        System.out.println(result2);
    }

   // ==========  CREATE METHODS FOR REMOVE DUPLICATES=======
    public static String RemoveDuplicates(String str) {

        String result = "";//AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//B
            if (!result.contains("" + ch)) {//we concate to empty string
                result += ch;
            }


        }
        return result;
    }
}
