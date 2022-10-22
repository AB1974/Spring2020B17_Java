package day21_MultiDimensionalArray;


import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        System.out.println("=======.toCharArray==========");
        String name="Java";//index numbers 0/1/2/3
        char[] chars=name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[3]);
        System.out.println("==========SPLIT METHOD======");
        String str ="I like Java";

        String []arr=str.split("");
        System.out.println(Arrays.toString(arr));

        System.out.println("example=====");

        String sentence ="Today is great day";
        String [] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String result="";

        for (int i=words.length-1;i>=0;i--){
            String eachWords = words[i];
            //System.out.print(eachWords+" ");
            result+=eachWords+" ";//or yukaridaki cozum

        }
        System.out.println(result);
        System.out.println("================");
        String str2 ="ABCD";//"A","B","C" HOW CAN I GET ?

        String []array= str2.split("") ;
        char [] ch2=str2.toCharArray();//'A','B','C'
        System.out.println(Arrays.toString(array));//these are string
        System.out.println(Arrays.toString(ch2));//these are char
    }
}
