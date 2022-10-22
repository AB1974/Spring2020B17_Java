package day52_CollectionFramework_Intro;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
//Queue is Interface can not create Object from Interface!
        Queue<String> q = new PriorityQueue<>();//First In First Out Order(FIFO)
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        //it will return / remove very first Object
        System.out.println(q);//A,B,C,D
        String str = q.poll(); //A
        System.out.println(q);//B,D,C


    }
}
