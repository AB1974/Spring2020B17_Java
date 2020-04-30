package day00_StudyAtHome;

import java.util.ArrayList;

public class study2905 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();//3,2,8
        list.add(3);//0
        list.add(2);//1
        list.add(8);//2

        int sum = list.get(0) + list.get(1) + list.get(2);

        Integer Sum = list.get(0) + list.get(1) + list.get(2);
        Object Sum2 = list.get(0) + list.get(1) + list.get(2);

        System.out.println(sum);//rakam int -unboxing
        System.out.println(Sum);//object Integer -noneboxing
        System.out.println(Sum2);//object
        System.out.println("=============");
        int top = 0;
        for (int i = 0; i < list.size(); i++) {
            top += list.get(i);

        }
        System.out.println(top);


    }
}
