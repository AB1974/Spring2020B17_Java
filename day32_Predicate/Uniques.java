package day32_Predicate;

import java.util.*;

public class Uniques {

    // write a program that can return the unique objects from arraylist of characters

    public static void main(String[] args) {

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result = new ArrayList<>();  // [B, C]


        /*
        for(int i = 0; i < charList.size(); i++ ){
            int count = Collections.frequency(charList, charList.get(i));
            if(count == 1){
                result.add( charList.get(i) );
            }
        }
         */

        for(Character each: charList ){ // each: A, A, B, C, D, D

            int count = Collections.frequency(charList, each);
            if(count == 1){
                result.add( each );
            }

        }



        System.out.println(result);



    }



}