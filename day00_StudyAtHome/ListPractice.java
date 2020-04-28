package day00_StudyAtHome;

import java.util.ArrayList;

public class ListPractice {

    public static void main(String[] args) {


        ArrayList<String> lst =new ArrayList<>();

        lst.add("Banana");
        lst.add("milk");
        lst.add("bread");
        System.out.println(lst);
        System.out.println(lst.size());
        System.out.println(lst.get(0));//gets first element
        System.out.println(lst.contains("Banana"));//true
        System.out.println(lst.indexOf("milk"));
        System.out.println(lst.size());
        System.out.println(lst.isEmpty());
        lst.set(1,"Pear");
        System.out.println(lst);
        lst.remove(0);
        System.out.println(lst);
        lst.remove(1);
        System.out.println(lst);
        lst.clear();
        System.out.println(lst);
        System.out.println(lst.isEmpty());

    }
}
