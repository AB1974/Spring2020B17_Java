package day20_Arrays02;

public class ArraysSize {

    public static void main(String[] args) {

        int[] arr1={1,2,3};
        //          0 1 2
        //System.out.println(arr1[100]);//array size is fixed can not print
        System.out.println(arr1[2]);//answer is 3 "second index no is 3

        int[] nums=new int[2];//index are {0,0} ; 0~1 are index numbers.
        nums[0]=10;//these defines the numbers are in array
        nums[1]=20;//these defines the numbers are in array
        //num[2]=30;//gives an error

       //nums= new int[3];//Reset
        System.out.println(nums[0]);//index are{0,0};
        System.out.println(nums[1]);

        nums= new int[3];//Reset{0,0,0}compiler gives (0)
        System.out.println(nums[0]);//index {0};
        System.out.println(nums[1]);//index {0};
        System.out.println(nums[2]);//index {0};

        System.out.println(arr1.length);




    }
}
