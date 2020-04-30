package OfficeHours.Practice_04_29_2020;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        //indexOf(Object)//returns the index no

        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('E');
        list1.add('C');
        list1.add('C');

        int indexNum = list1.indexOf('C');

        System.out.println(indexNum);

        System.out.println(list1.indexOf('C'));
        System.out.println(list1.indexOf('c'));//-1//means does not exist.//it gives you first matching objects index no.


        int lastIndexNUm = list1.lastIndexOf('C');// index no is 6
        System.out.println(lastIndexNUm);
        System.out.println(list1);
        //Character ch1='C';//this is object
        list1.remove(list1.lastIndexOf('C'));
        System.out.println(list1);


        System.out.println("===========================");
//combining two arrays into the list

        int[] arr1 = {1, 2, 3, 4, 5,};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13};

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int each : arr1) {//each element of arr1

            list2.add(each);
        }
        for (int each : arr2) {//each element of arr2

            list2.add(each);
        }
        System.out.println(list2);

    }

}
