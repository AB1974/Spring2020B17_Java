package Interview3;

import java.util.*;

public class CollectionPracticeReview {

    // Iterable (I)
    // Collection(I)
    //List(I)- + All keep order  + Accepts Duplicates + Index No
    // -ArrayList(C) + retrieving is faster + singly linked
    // -LinkedList(C) + removing adding is faster + doubly link
    //  -Vector(C)   +  synchronized
    //--Stack(C) //pop () method LIFO

    public static void main(String[] args) {

        List<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
        System.out.println(num1);
        //100, 2000, 50, 50, 100, 200, 300, 50


        List<Integer> num2 = new LinkedList<>();
        num2.addAll(Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
        System.out.println(num2);
       //100, 2000, 50, 50, 100, 200, 300, 50


        Collections.sort(num2);
        System.out.println(num2);//50,50,50,100,100,200,300,2000


        int a = Collections.frequency(num2, 50);
        System.out.println(a);//3


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));//this is not synchronized
        list = Collections.synchronizedList(list);//it's synchronized NOW//now is thread safe
        System.out.println(list);//1,2,3,4,5



        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
        nums = new ArrayList<>(new TreeSet<>(nums));
        System.out.println(nums);//50,100,200,300,2000



        String str = "ABABABCDEFGGKKLLMMMMMMMM";
        String[] arr = str.split("");
        str = new LinkedHashSet<>(Arrays.asList(arr)).toString().replace(", ", "");
        System.out.println(str);//[ABCDEFGKLM]



    }


}
