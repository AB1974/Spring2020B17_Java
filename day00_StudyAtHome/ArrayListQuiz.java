package day00_StudyAtHome;

import day30_ArrayList.ArraysList_Methods;

import java.util.ArrayList;

public class ArrayListQuiz {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);//0
        list1.add(2);//1
        list1.add(3);//2
        int a = 1;
        list1.remove(a);  //remove element in the given index
        System.out.println(list1);
        System.out.println("==============");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);//0
        list2.add(2);//1
        list2.add(3);//2
        Integer a1 = 1;//this is object
        list2.remove(a1);  //remove object in the given index
        System.out.println(list2);
        System.out.println("==================");
        ArrayList<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");// remove first one
        names.add("Rick");
        names.add("Bran");
        if (names.remove("Bran")) {
            names.remove("John");

        }
        System.out.println(names);
        System.out.println("==================");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3, "cyan");
        System.out.println(colors);
        System.out.println("================");
        ArrayList<Integer> list = new ArrayList<>();
        Integer b = 1;
        System.out.println((list.remove(b)));//false
        System.out.println("=============");
       // ArrayList<Integer>list3=new ArrayList<>();
       // int z=1;
       // System.out.println(list3.remove(z));//out of bound
        System.out.println("===============");
        //  Test obj=new Test();compile error
        //System.out.println("Corolla");
        //public Test(int a){
        // System.out.println("Toyota");
        System.out.println("=================");


    }

    }

