package day00_StudyAtHome;
import java.util.*;
public class study187 {


        public static ArrayList<String> combineAl(){

            ArrayList<String> wordList1=new ArrayList<>();
            ArrayList<String> wordList2=new ArrayList<>(wordList1);
            ArrayList<String> yeni=new ArrayList<String>();


            for(int i=0;i<wordList1.size();i++) {

                yeni.add(wordList1.get(i));

            }
            for(int i=0;i<wordList2.size();i++) {

                yeni.add(wordList2.get(i));

            }


            return yeni;

        }

        //create your method below

    }

