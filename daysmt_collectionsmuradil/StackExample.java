package daysmt_collectionsmuradil;

import java.util.*;


public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> numStack=new Stack<>();
        numStack.add(50);
        numStack.push(60);
        numStack.push(70);


        System.out.println(numStack.toString());

        System.out.println(numStack.peek());
    }
}
