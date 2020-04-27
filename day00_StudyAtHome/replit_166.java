package day00_StudyAtHome;

public class replit_166 {

    public static String mergeStrings(String one, String two) {
        String merged="";
        for (int i=0; i<one.length() || i<two.length(); i++){
            if (i<one.length()){
                merged+=one.charAt(i);
            }
            if (i<two.length()){
                merged+=two.charAt(i);
            }
        }
        return merged;
    }
    public static void main(String[] args) {
        String str1 = "wooden";
        String str2 = "spoon";
        String merge = mergeStrings(str1, str2);
        System.out.println(merge); // wsopoodoenn
    }
}