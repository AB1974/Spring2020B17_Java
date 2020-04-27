package day00_StudyAtHome;

public class NestedforloopSplitMethod {

    public static void main(String[] args) {

        String words = "poopoo what idk what im doing";

        String[] str = words.split("");
        String[] WOW = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < WOW.length; j++) {
                if (str[i].equals(WOW[j])) {
                    System.out.print(str[i]);
                }
            }


        }
    }
}
