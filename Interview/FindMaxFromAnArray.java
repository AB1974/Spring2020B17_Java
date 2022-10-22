package Interview;


import java.util.*;

public class FindMaxFromAnArray {


    public static void main(String[] args) {

        int num[] = {1, 31, 4, -7, 29};

        List<Integer> list = new ArrayList<>();
        for (int each : num) {
            list.add(each);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));

        System.out.println("=============");

        // Solution 2:

        int n[] = {1, 31, 4, -7, 29};

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);
        System.out.println("===========");

        Arrays.sort(n);
        for(int i=0;i<n.length;i++){

        }
        System.out.println(n[n.length-1]);
    }
}



