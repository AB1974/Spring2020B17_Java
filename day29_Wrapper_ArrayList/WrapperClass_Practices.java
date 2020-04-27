package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClass_Practices {
    /*
       String[] arr = {"1","2.5", "3", "3.5", "4.5"}
       find the maximum and minimum numbers from STRING!!!!!!!!!!
       NOTE: Do not use sort method

        */
    public static void main(String[] args) {

        String[] arr = {"500","1", "2.5", "3", "3.5", "4.5","55"};
        double[] numbers = new double[arr.length];//[0.0,0.0,0.0,0.0,0.0]

        for (int i = 0; i < arr.length; i++) {

            numbers[i] = Double.parseDouble(arr[i]);
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);

        System.out.println("========================");

        String[] arrZ = {"1","2.5", "3", "3.5", "4.5"};

        double max = Double.MIN_VALUE; // 2.5

        for(String each: arrZ){ // 5, each: 1, 2.5, 3, 3.5, 4.5
            double num = Double.valueOf(each);

            if( num > max){
                max= num;
            }

        }
        System.out.println(max);

        System.out.println("========================");

        String[] arr2 = {"100", "1","2.5", "3", "3.5", "4.5", "55"};

        double[] numbersS = new double[arr2.length]; //[0.0 , 0.0, 0.0, 0.0, 0.0]

        for(int i=0; i < arr2.length; i++){
            numbersS[i] =  Double.parseDouble(arr2[i]);
        }


        Arrays.sort(numbersS);

        System.out.println(Arrays.toString(numbersS) );

        System.out.println( numbersS[numbersS.length-1] );








    }

}
