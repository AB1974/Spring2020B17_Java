package Interview;

import java.util.Arrays;

public class ReversedArraySaim {

    public static int[] reversed(int[] array) {
        for (int i=0;i<array.length/2;i++)
        {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }

            return array;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reversed(a)));
    }
}
