package day29_Wrapper_ArrayList;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class ListMethods {


    public static void main(String[] args) {
        System.out.println("=======ADD METHOD=====");

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(10);//Autoboxing size 1; Autoboxing  nedeniyle 10 rakamini add edebiliyoruz.
        scores.add(20);//Autoboxing size 2;
        scores.add(30);//Autoboxing size 3;

        scores.add(1,15);//index 1 'e (15) ekliyorum!//add(index,object)
        scores.add(3,25);//index 2 'ye (25) ekliyorum!//add(index,object)

        System.out.println(scores);

        System.out.println("=======GET METHOD=====");

        Integer a1 = scores.get(2);//it returns you object which is Integer NOT  int !!!!!!!!!!!
        //wrapper class//wrapper class
        int a2 = scores.get(2);//2 is index no
        //unboxing

        double a3 = scores.get(2);//2 is index no
        //unboxing

        System.out.println(a1);//prints 30 [10,20.30] index no is 2
                                            //0, 1, 2

        //System.out.println(scores.get(100));index out of bounds.

        System.out.println("======SIZE() METHOD====== ");

        ArrayList<String>shoppingList=new ArrayList<>();

        shoppingList.add("Milk");//size 1
        shoppingList.add("Coffee");//size 2
        shoppingList.add("Bread");//size 3
        shoppingList.add("Toilet  Paper");//size 4
        shoppingList.add("Eggs");//size5

        for(int i=0;i<shoppingList.size();i++){//    i:0,1,2,

            System.out.println(shoppingList.get(i));

        }

        System.out.println("===================");

        for(String each:shoppingList){

            System.out.println((each));


        }

        int size=shoppingList.size();//its like a length method.returns size length of the array list as an int!
        System.out.println(size);

        int lastIndex=shoppingList.size();
        System.out.println(lastIndex);




    }

}
