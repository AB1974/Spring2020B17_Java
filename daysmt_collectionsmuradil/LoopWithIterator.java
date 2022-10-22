package daysmt_collectionsmuradil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(50, 60, 70, 80, 90));

        //1Create iterator Object
        Iterator<Integer> it = nums.iterator();
        //2-Call hasNext, next methods

       /**
         * HasNext returns true if there is still next value
         * return false it reaches the end or empty
         *next () return current value and move to next value
         */
        System.out.println("it.hasNext()->"+it.hasNext());//Boolean
        System.out.println("it.next()->"+it.next());//Boolean//50
        System.out.println("it.next()->"+it.next());//Boolean//60
        //3-use a while loop
        while (it.hasNext()){
            System.out.print(+it.next()+" | ");
            System.out.println();

        }
   //     System.out.println(it.next());//No such element exception
/**
        for (int num:nums){
            if(num>70){
                nums.remove(num);
            }

        }
 */
    }
}
