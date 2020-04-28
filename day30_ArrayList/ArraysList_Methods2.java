package day30_ArrayList;

import java.util.ArrayList;

public class ArraysList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();//REMOVE B
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove(1);
        System.out.println(list);

        String str="C";
        boolean bool1=list.remove(str);//this one we are removing the object.you can assign to a boolean
        System.out.println(list);
        System.out.println(bool1);//value is true

        String str1="z";
        boolean bool2=list.remove(str);
        System.out.println(list);
        System.out.println(bool2);//value is false

        System.out.println("=======CLEAR METHOD==========");

        list.clear();
        System.out.println(list);
        System.out.println(list.size());//size is zero.

        System.out.println("======index of method=======");
        //indexOf()
        //lastIndexOf() returns you index numbers of the objects

        ArrayList<Integer>list2=new ArrayList<>();

        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);

       int num1= list2.indexOf(1);//first matching one
                    //Integer=int//autoboxing
        System.out.println(num1);
        int num2=list2.indexOf(100);
        System.out.println(num2);//-1 means object is not exist!

        int num3=list2.indexOf(3);//3
        System.out.println(num3);





    }
}
