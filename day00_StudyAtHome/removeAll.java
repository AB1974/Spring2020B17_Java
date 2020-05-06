package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAll {

    public static void main(String[] args) {


        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList("aylin","engin","ahmet","mehmet","aylin","engin"));
        list.removeAll(Arrays.asList("aylin","engin"));
        System.out.println(list);
    }
}




