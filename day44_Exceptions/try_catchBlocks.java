package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {

    public static void main(String[] args) {
        System.out.println("Test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));



        try {
            System.out.println(list.get(10));
        } catch (IndexOutOfBoundsException e) {//We can type Runtime Exception //Exception is the best !
            System.out.println("something went wrong");
        }
        System.out.println("Test completed");
    }


}
