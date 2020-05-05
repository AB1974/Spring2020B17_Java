package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class isPalindrome {

    public static void main(String[] args) {

        String check = "Nurses Run";
        String reversed = "";
        String wospace = check.replaceAll(" ", "");

        for (int i = wospace.length() - 1; i >= 0; i--) {

            reversed += wospace.charAt(i);

        }

        if (wospace.equalsIgnoreCase(reversed)) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
