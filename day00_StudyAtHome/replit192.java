package day00_StudyAtHome;
import java.util.*;
public class replit192 {


    public static void main(String[] args) {
        ArrayList <Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        ArrayList <Integer>number=new ArrayList<>();

        for (Integer each:nums){
            number.add(each*2);

        }
        System.out.println(number);

    }

    public static void timesTwo(ArrayList <Integer>nums){

        ArrayList <Integer>number=new ArrayList<>();

        for (Integer each:nums){
            number.add(each*2);

        }
        System.out.println(number);
    }

}




