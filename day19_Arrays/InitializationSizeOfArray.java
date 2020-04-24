package day19_Arrays;

import java.awt.*;

public class InitializationSizeOfArray {

    public static void main(String[] args) {

    //length function of array

        //a.giving the values

        int array1[] = {10, 20, 30};


        System.out.println(array1.length);//to find the size of array .


        //giving the size only!

        int array2[] = new int[5];
        System.out.println(array2[0]);//index no is 0 as default from Java
        System.out.println(array2[1]);//index no is 0 as default from Java
        System.out.println(array2[2]);//index no is 0 as default from Java
        //default values:
        //byte,short,int

        String Testers[] = new String[3];//{Reem,Madina,Osman} //size is 3

        //index no      0, 1,2

        System.out.println(Testers[0]);//null. you have not given any index value yet !

        Testers[0] = "Reem";
        System.out.println(Testers[0]);
        System.out.println(Testers[1]);
        Testers[1] = "Madina";
        Testers[2] = "Osman";
        System.out.println(Testers[0]);
        System.out.println(Testers[1]);
        System.out.println(Testers[2]);

        System.out.println(array1.length);


        System.out.println("=================");

        String[] students = new String[10];
        // write a program that asks "enter a name" 10 times, and store each of the names in the array students



















    }
}
