package Interview2;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
//LIST  accepts duplicate//have index number
        System.out.println("=====ArrayList==========");
//ArrayList
// Not   Synchronized
        List<String> list1 = new ArrayList<>();
        //ArrayList get(index);faster
        //adding removing slower
        list1.add("A");
        list1.add("A");
        list1.add("B");
        System.out.println(list1);//A,A,B
        System.out.println(list1.get(2));// B
        System.out.println("=====LinkedList==========");
//LinkedList
        // Not   Synchronized
        List<String> list2 = new LinkedList<>();
        //LinkedList get (index);slower
        // removing adding faster
        list2.add("A");
        list2.add("A");
        list2.add("B");
        System.out.println(list2);
        System.out.println(list2.get(2));
        System.out.println("====vector===========");

//Vector & Stack
// Synchronized-thread safe-slower(Tek Tek )
        List<String> list3 = new Vector<>();
        list3.add("A");
        list3.add("A");
        list3.add("B");
        System.out.println(list3);
        System.out.println(list3.get(2));
        System.out.println("=======stack========");

//Stack-
        Stack<String> list4 = new Stack<>();
        list4.add("A");
        list4.add("A");
        list4.add("B");
        list4.pop();//pop LIFO,DELETE LAST ELEMENT
        System.out.println(list4);

//SET  does not accepts duplicate//NO  index number
        //has own order//accepts null
        System.out.println("=======SET/HashSet========");
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("A");
        set1.add("B");
        set1.add(null);
        System.out.println(set1);
        System.out.println("=======SET/LinkedHashSet========");
//LinkedHashSet  does not accepts duplicate//NO  index number
        //remove,add faster.
        //Maintain InsertionOrder
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("A");
        set2.add("D");
        set2.add("B");
        set2.add(null);
        System.out.println(set2);
        System.out.println("=======SET/TreeSet========");
//TreeSet  does not accepts duplicate//NO  index number
        //Sorts in Ascending Order//does not accepts null
        Set<String> set3 = new TreeSet<>();
        set3.add("A");
        set3.add("D");
        set3.add("B");
        System.out.println(set3);


    }
}
