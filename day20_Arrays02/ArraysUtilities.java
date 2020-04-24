package day20_Arrays02;
import java.util.Arrays;
public class ArraysUtilities {
    public static void main(String[] args) {

   // Arrays.toString(arrayName):convert arrays to String

        int num[] = {1, 2, 3};

        String str = Arrays.toString(num);

        System.out.println(str);//arrays must be converted to string before you print it.


        String names[]={"Medina","Fatih"};

        System.out.println(Arrays.toString(names));//you need for printing

        double[] nums ={10,20,30};
        System.out.println(nums);//you can not print this directly
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]+1);//10.0//concat two numbers


    }
}
