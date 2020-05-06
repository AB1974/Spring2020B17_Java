package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodwithArrayList {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        Collections.swap(list, pos1, pos2);


        return list;
    }


    public static void main(String[] args) {

        ArrayList<String> swapp = new ArrayList<>();
        swapp.addAll(Arrays.asList("a", "c", "b", "d", "e"));
        System.out.println(swap(swapp,0,3));

    }//end main
}

