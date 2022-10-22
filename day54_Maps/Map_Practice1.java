package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_Practice1 {

    public static void main(String[] args) {
        //create a map that contains student names and scores
        //put 5 student names and their scores
        //write a program that can print out names who has the score less than 90!

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for( String eachKey   : students.keySet()  ){
            int eachValue = students.get(eachKey);  // score

            if( eachValue < 90){
                badStudents.put(eachKey, eachValue );
            }else{
                goodStudents.put(eachKey, eachValue );
            }
        }


        System.out.println(badStudents);
        System.out.println(goodStudents);





    }

        }


