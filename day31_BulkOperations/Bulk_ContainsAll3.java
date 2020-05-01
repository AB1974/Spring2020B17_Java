package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll3 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        // if 10,20,60,80,90,100,200,300 if all objects are exist in array list ==>true
        //otherwise is false
        /*
        boolean r1 = list1.contains(10);
        boolean r2 = list1.contains(20);
        boolean r3 = list1.contains(60);

        boolean result = r1 == true && r2 == true && r3 == true;

        System.out.println(result);//false

        */
        System.out.println("=======Arrays.asList======");
        boolean result2=list1.containsAll(Arrays.asList(10,20,60));
        boolean result3=list1.containsAll(Arrays.asList(10,20,30,40));
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("==============");
        //if you do not want to do it above way do it with below way
        Integer[] data={10,20,30,40};

        boolean bool1=list1.containsAll(Arrays.asList(data));
        //Arrays.asList method returns you collection type and you can use it in containsAll method.
        System.out.println(bool1);






    }

}
