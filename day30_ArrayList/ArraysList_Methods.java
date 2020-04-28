package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods {

    public static void main(String[] args) {

        System.out.println("========ADD METHOD======");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);

        list.add(1, 6);
        System.out.println(list);

        System.out.println("=========SET METHOD=======");

        list.set(3, 9);//in order to replace original object(8)in index 3  with new given object(9)!

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");//A
        list2.add("B");//AB
        list2.add(1, "C");//ACB
        list2.add(1, "D");//ADCB

        System.out.println(list2);//A,D,E,F
        list2.set(3, "F");
        System.out.println(list2);
        list2.set(2, "E");
        System.out.println(list2);

        System.out.println("========REMOVE METHOD============");
        //remove(index)
        //remove(object)
        ArrayList<Integer> list3 = new ArrayList<>();//max index no is 3
        list3.add(1);//0
        list3.add(2);//1
        list3.add(3);//2
        list3.add(4);//3

        System.out.println(list3);

        //remove (int index)
        //remove(object)
        int b = 1;
        list3.remove(1);//object at the given index will be removed!
        //list3.remove(b);
        System.out.println(list3);
        //{1,2,3,4}
        Integer a = 1;//this is an object
        list3.remove(a);//{2,3,4}
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(10);
        list4.add(20);
        list4.add(30);

        list4.remove(1);
        System.out.println(list4);

        System.out.println("======removing object======");
        Integer a2=30;//this one is object
        boolean b1=list4.remove(a2);//you are removing the object//it returns you a boolean""true"
        System.out.println(list4);
        System.out.println(b1);
        Integer a3=50;//this one is object but not in the array list
        boolean b2=list4.remove(a2);//you are removing the object//it returns you a boolean""false"
        System.out.println(list4);
        System.out.println(b2);


    }
}
