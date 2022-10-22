package day16_ForLoop2;

public class InterviewRemoveDuplicate {

    public static void main(String[] args) {

        String str = "ABAB";


        String result = "";  // "AB" we store the expected result in this variable

        for(int i=0; i <= str.length()-1 ; i++){  // 0 , 1, 2 ,3
            /*
            if( !result.contains( ""+str.charAt(i)) ) {
                result += str.charAt(i);
            }
             */


            result += str.charAt(i);//only gets executed if str.charAt(i) contains the result

        }

        System.out.println(result);
    }
}
