package day20_Arrays02;
import java.util.Arrays;
public class ArraySortMethod {
    public static void main(String[] args) {

        //sorts the given array in ascending number.
        //Arrays.sort(arrayName);

        int[] arr1 = {20, 445, -1, 34, 3, 1, 100};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //first min number
        //firs max number
        System.out.println("First min number is: " + arr1[0]);
        System.out.println("Second min number is: " + arr1[1]);

        System.out.println("First max number is: " + arr1[arr1.length - 1]);
        System.out.println("Second max number is: " + arr1[arr1.length - 2]);

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'C', 'D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));//it returns you ascii table order

        String[] names = {"Aylin", "Engin", "Arin", "Erin", "ANna"};//N comes first before n
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("===========================");

        //lets do it descending order!//we need to reverse it

        int[] arr = {3, 1, 4, -1, -100, 200, 155};

        Arrays.sort(arr);

        int[] arrDes = new int[arr.length];//we are going to store descending numbers into this array

        //we need loop//

        int j = 0;  //Represents arrDes' index number


        for (int i = arr.length - 1; i >= 0; i--) {

            arrDes[j] = arr[i];

            j++;
        }
        System.out.println(Arrays.toString(arrDes));//descending orders
    }
}
