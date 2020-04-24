package day22_ArrayAndLoopPractices;


import java.util.Arrays;

public class Multi_DArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

        int[] arr1D = arr2D[0];

        System.out.println(Arrays.toString(arr1D));//in order to print single dimensional array

        System.out.println(Arrays.toString(arr2D[0]));//single dimensional array from arr2D

        System.out.println(arr2D[0][2]);//3//it return to a string //single dimensional array .

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));


        System.out.println("==for each=========");
        //lets print {1,2,3} as single element

        for (int eachElement : arr2D[0]) {

            System.out.print(eachElement + " ");
            System.out.println();
        }

        System.out.println("+=======for ===================");
        for (int i = 0; i < arr2D[0].length; i++) {

            int num = arr2D[0][i];
            System.out.println(num);
        }
        System.out.println("================");
        int[][] array = {{2, 3, 4}, {1, 2, 3}};

        for(int each :array[1]){

            System.out.println(each);
        }






    }
}
