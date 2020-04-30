package day00_StudyAtHome;

import java.util.*;

public class replit190 {

    public static void main(String[] args) {


        //create your method below


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(-2);
        list.add(8);
        ArrayList<Integer> yeni = new ArrayList<>();


        for (int i = 0; i <list.size(); i++) {

            if (list.get(i) > 0) {

                yeni.add(list.get(i));

            }

        }
        int sum=0;
        for (int i = 0; i <yeni.size(); i++ ){
            sum+=yeni.get(i);

        }
        yeni.add(sum);
        System.out.println(yeni);
    }


}

