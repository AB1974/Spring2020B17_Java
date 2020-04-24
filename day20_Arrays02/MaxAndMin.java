package day20_Arrays02;

public class MaxAndMin {

    public static void main(String[] args) {

           /*
    1. write a program that can find the maximum number from any given int array

    2. write a program that can find the minimum number from any given int array
        */

        int array[] = {10, 3, 4, 5, 6, 7, 8, 9};
        int lasIndex = array.length - 1;          //total number of element
        int max = array[0];//just an assumption
        int min=array[0];

        for (int i = 0; i <= lasIndex; i++) {

            if (array[i] >= max) {//array's index are comparing to each other.
                                //whichever is greater will be assigned to the max .
                max = array[i];
            }

            if(array[i]<min){//array's index are comparing to each other.
                            //whichever is smaller will be assigned to the min .
                min=array[i];
            }
        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}
