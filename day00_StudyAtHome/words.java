package day00_StudyAtHome;

public class words {

    public static int wordCount(String words) {

        String []words1=words.split(" ");
//        int count=0;
//
//        for(int i=0;i<words1.length-1;i++){
//            count++;
//            System.out.println(count);
//        }
        return words1.length;

    }


    public static void main(String[]args){

        int a=wordCount("Java is good");
    }
}

