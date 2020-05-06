package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAlll {

    public static ArrayList<String> removeAll(ArrayList<String> wordList, String target) {


        wordList.removeAll(Arrays.asList(target));

        return wordList;
    }

    public static void main(String[] args) {

        ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("Aylin", "Engin", "Aylin", "Engin", "Arin"));

        String target = "Aylin";
        ArrayList<String> newList=removeAll(wordList1, target);
        System.out.println(newList);

    }
}

