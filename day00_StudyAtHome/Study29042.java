package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class Study29042 {

    public static void main(String[] args) {

        String[] str = {"Aylin", "Arin", "Engin", "Pity", "Sevinc"};

        //  ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str));
        list.add(2, "Fugen");
        System.out.println(list);
      String [] str1=list.toArray(str);
        System.out.println(Arrays.toString(str1));

//        for (int i = 0; i < str.length; i++) {
//
//            list.add(str[i]);
//        }
        System.out.println("--------------STA----------------");

        String[] r1 ={"Engin","Bekem"};
        String[] r2 ={"Aylin","Bekem"};

        ArrayList<String> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(r1));
        list4.addAll(Arrays.asList(r2));


        String a ="";

        for(int i=0;i<list4.size();i++){

            a+=list4.get(i);

        }


        System.out.println(a);

String kk ="engin";

StringBuffer jj = new StringBuffer(kk);
        System.out.println(jj.reverse());




    }
}
