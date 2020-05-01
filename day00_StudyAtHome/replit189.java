package day00_StudyAtHome;

public class replit189 {
    public static boolean isError(String line)

    {
        String word="";

        if(word.toUpperCase().startsWith("error")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b1=isError("fooerror foo");
        System.out.println(b1);
    }
}


