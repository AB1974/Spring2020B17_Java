package day00_StudyAtHome;

public class replit179 {

    public static String reverse(String input) {

        String reverse = "";
        for (int i = input.length()-1; i>=0; i--) {
            reverse += input.charAt(i);

        }
        return reverse;

    }

    public static void main(String[] args) {
        String str = reverse("Aylin");
        System.out.println(str);
    }
}

