package day33_CustomClass;

import java.util.*;

/**
 * Method name:countOccurances
 * Return int
 * Params ArrayList<String >,String word
 * Method counts how many times word appears in the list and returns count.case sensitive.
 */
public class countOccurances {

    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("Moon");
        mylist.add("Sun");
        mylist.add("Saturn");
        mylist.add("Sun");
        mylist.add("Pluto");
        mylist.add("Sun");

        String targetWord = "Sun";
        int count = countOccurences(mylist, targetWord);
        if(count==3) {
            System.out.println("Unit test PASS:Count is 3.");
        }else{
            System.out.println("Unit test FAILED:Count is 10.");

        }

    }

                                         //[aa,aa,bb,jj,yy]        //aa
    public static int countOccurences(ArrayList<String> list, String word) {

        int count = 0;
        for (String each : list) {
            if (each.equalsIgnoreCase(word)) {
                count++;

            }

        }
        return count;
    }

}
