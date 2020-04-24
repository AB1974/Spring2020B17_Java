package day20_Arrays02;
import java.util.*;

public class CombineTwoArrays {

    public static void main(String[] args) {

        //write a program :combine two arrays any length return the third array!

        //arr1==[1,2,3]
        //arr2==[4,5,6,7]
        //arr3==[1,2,3,4,5,6,7]//it has to be enough size !

        Scanner scan =new Scanner (System.in);
       

        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6, 7};
        int arr3[]=new int[arr1.length+arr2.length];


        for(int i=0 ;i<arr1.length;i++){

            arr3[i] =arr1[i];
        }

        for(int i=0;i<arr2.length;i++){

            arr3[arr1.length+i]=arr2[i];//we add (i) because we want to continue from 4 !
            //arr1.length+i means 3+0 which refers to number {4}
        }
        System.out.println(Arrays.toString(arr3));




        }


    }

