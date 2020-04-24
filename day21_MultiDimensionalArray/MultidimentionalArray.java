package day21_MultiDimensionalArray;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

public class MultidimentionalArray {

    public static void main(String[] args) {
                //      0 1 2
        int[] array = {1, 2, 3};
                        // 0 1 2     0  1  2  3
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6,7}};
                   //          0       1 / /those are index number of each single dimentional array

        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[0]));

        System.out.println(Arrays.toString(arr2D[1]));

        int[] arr1D = arr2D[0];//1,2,3

        System.out.println(Arrays.toString(arr1D));

        int num1 = arr2D[1][3];//second bracket represent each index number
        System.out.println(num1);

        System.out.println("============");
        //{'A','B'}
                // index    0   1     0  1   2
       char [][] ch2D ={ {'A','B'},{'D','E','F'},{'G','H','I'} };

        //                  0              1            2//single dimensional array

        char c1 = ch2D[1][0];

        System.out.println(c1);

        char[] ch2 = ch2D[2];//{G,H,I}

        System.out.println(Arrays.toString(ch2));



    }
}
