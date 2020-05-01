package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class replits {


        public static void main(String[] args)
        {                                                           //0,1,2,3,4
            ArrayList<String> words=new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","boop"));


            for(int i=0;i<words.size();i++){

            words.remove(i);
           }
            System.out.println(words);
        }
        //create your method below



        }

