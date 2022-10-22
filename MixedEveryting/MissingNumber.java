package MixedEveryting;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8};//4 is missing number
        //actual length is 7
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        int realSize = arr.length + 1;

        int total = realSize * (realSize + 1) / 2;

        System.out.println(total);

        System.out.println("Missing number is:  " + (total - sum));

        int arr2[] = {1, 2, 3, 2, 3, 4, 5, 4};//8

        List<Integer> removeDup1 = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            if (!removeDup1.contains(arr2[i]))
                removeDup1.add(arr2[i]);
        }

        removeDup1.removeIf(each -> each % 2 != 0);//short cut

        System.out.println(removeDup1);
    }
}
