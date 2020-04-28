package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    /*
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}

    			there is a replit
     */
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};

        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();//combine two array

        for (int i = 0; i < arr1.length ; i++) {
            String eachElement = arr1[i];
            list.add(eachElement);//or list.add(arr1[i])

        }
        for(String eachElement:arr2){
            list.add(eachElement);

        }
        System.out.println(list);
    }

}
