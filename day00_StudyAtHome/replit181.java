package day00_StudyAtHome;
import java.util.*;
public class replit181 {

    public static String combineRs(String[] r1,String[] r2) {

        ArrayList<String>list=new ArrayList<>();

        list.addAll(Arrays.asList(r1));
        list.addAll(Arrays.asList(r2));

        String a ="";

        for(int i=0;i<list.size();i++){

            a+=list.get(i);

        }



        return a;

    }
}


