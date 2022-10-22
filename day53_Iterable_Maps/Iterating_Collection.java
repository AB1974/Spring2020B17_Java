package day53_Iterable_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    //Iterable(I)=Root interface

    // classes that implements iterable, gains the ability to iterate the objects
    // we can apply Iterator(I) to the classes that are implementing Iterable
    //Why we need to iterate Objects ?
    //1-it allows us to get access to each objects at the collections type
    //2-it allows us to remove the objects from Collection Type


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
/*
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println(list);
        This loop does not remove the object from collections !
*/
        System.out.println("================");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        list1.removeIf(p -> p < 4);//this Iterator  removes the objects from collections//internally using iterator interface internally

        System.out.println(list1);

        System.out.println("=================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        Iterator<Integer> it = list3.iterator();

        it.hasNext();//it returns boolean.if there is an element has left return true otherwise false

        it.next();//to be able to retrieve data. get the object if it.hasNext() is true !(returns string)

        it.remove();//it removes current element of iteration


        while (it.hasNext()) {
            if (it.next() < 4) {
                it.remove();
            }

        }
        System.out.println(list3);

        System.out.println("=================");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        for (Iterator<Integer> I = list4.iterator(); I.hasNext(); ) {

            if (I.next() < 4) {
                I.remove();
            }

        }
        System.out.println(list4);

    }
}
