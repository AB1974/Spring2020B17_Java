package day21_MultiDimensionalArray;

public class LongestShortestString {

    public static void main(String[] args) {

/*
	2. write a program that can return the longest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */

        String [] names={"Reem","Omer","Muhtar","Emrah","Mohammed","Ana"};

        int maxLengthString = names[0].length();//we are just assuming//4
        int minLengthString = names[0].length();//we are just assuming//4

        String LongestWord = names[0];//or "";
        String shortestWord = names[0];//or "";

        for (int i = 1; i <= names.length - 1; i++) {//or i < names.length

            if (names[i].length() > maxLengthString) {

                maxLengthString = names[i].length();
                LongestWord = names[i];
            }

            if(names[i].length()<minLengthString){

                minLengthString=names[i].length();
                shortestWord=names[i];
            }


        }
        System.out.println(LongestWord);
        System.out.println(shortestWord);
    }
}
