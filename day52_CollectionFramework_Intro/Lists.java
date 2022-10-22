package day52_CollectionFramework_Intro;

import java.util.*;

public class Lists {

    public static void main(String[] args) {

        //   List<String >list0=new List<>();
        // List is interface (I)can not create object out of it



        List<Integer> list1 = new ArrayList<>();//polymorphism
        list1.add(1);
        //ArrayList is Singly Linked it has advantage much more faster in terms of retrieving data
        //list1.get();faster! in Array List

        List<Integer> list2 = new LinkedList<>();
        //ArrayList is Doubly  Linked it has advantage much more slower in terms of retrieving data
        //LinkedList adding or removing is faster but getting data is slower !

        System.out.println("=========================");
        //all methods are same with ArrayList. but they are overridden in vector class is synchronized!


        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        Vector<Integer> vector = new Vector();
        vector.add(10);

        //Vector:achieving  thread-safety! (synchronized!)
        //thread:process of operating system scheduling object
        //ADVANTAGES : THREAD SAFE
        //DISADVANTAGES:SLOWER
        //multi-thread :means slower .

        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        //Stack is sub class of Vector
        //stack is synchronized too!
        //stack has unique ability(LAST IN FIRST OUT) ----LIF0
        //pop() method..is in stack ! not in vector class!

        Stack<String> names = new Stack<>();
        names.add("Aylin");
        names.add("Arin");
        names.add("Engin");
        names.add("Figen");
        names.add("Sevinc");
        System.out.println(names);
        String s1 = names.pop();//returns/remove  you last objects  from the stack!
        System.out.println(s1);
        System.out.println(names);
        String s2 = names.pop();
        System.out.println(s2);
        names.push("Arzu");//add and push is same functionality
        System.out.println(names);


    }

}
