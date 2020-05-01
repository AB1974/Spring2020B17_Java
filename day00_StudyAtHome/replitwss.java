package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class replitwss {
    /*
    ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

    removeAll(wordList,"hi");

    now wordList is ["hey","yo"]

     */
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
        String str="hi";


      ArrayList<String> gg = new ArrayList<>(Arrays.asList(str));
      wordList.removeAll(gg);

//wordList.removeAll(Collections.singleton(str));

      //  wordList.removeIf(Aylin->Aylin.contains(str));
       System.out.println(wordList);

    }
}
