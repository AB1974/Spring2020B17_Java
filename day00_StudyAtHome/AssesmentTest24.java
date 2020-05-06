package day00_StudyAtHome;

public class AssesmentTest24 {
    public static void main(String[] args) {

        System.out.println(appearsTwice("java", "is really fun ,java,java"));
    }

    public static boolean appearsTwice(String target, String sentence) {

        String[] str = sentence.split(" ");
        int count=0;
        while(sentence.contains(target)){
            count++;
            sentence=sentence.substring(sentence.indexOf(target)+target.length());
        }if(count==2){
            return true;
        }
        return false;
    }
}