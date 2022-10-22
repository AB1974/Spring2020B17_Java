package Interview2;

import java.util.*;

public class CollectionPractice2 {
    public static void main(String[] args) {


        String str = "samaaaaaaksnfanskfnsdfns";

        Set<String> remove = new TreeSet<>(Arrays.asList(str.split("")));
        remove.removeIf(p -> p.contains("a"));
        System.out.println(remove);
        System.out.println(Collections.max(remove));
        System.out.println(Collections.min(remove));

        List<String> list = new ArrayList<>(remove);
        System.out.println(list.get(list.size() - 1));
        int[] array = {1, 4, 66, 78, 8, 7, 5, 1, 2, 3, 4, 7, 9, 4, 5, 6};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 66, 78, 8, 7, 5, 1, 2, 3, 4, 7, 9, 4, 5, 6));

        list1.removeIf(p -> p == 1 || p == 2);
        System.out.println(list1);

        int[] a = {7, 11, 15, 18, 30};

        Set<Integer> a1 = new TreeSet<>();
        for (int each : a) {
            a1.add(each);
        }

        System.out.println(a1);


        List<Integer> a3 = new ArrayList<>(a1);
        List<Integer> a2 = new ArrayList<>();
        for (int each : a) {
            a2.add(each);
        }
        System.out.println(a2);
        System.out.println(a3);
        for (int i = 0; i < a2.size(); i++) {

            if (a2.equals(a3)) {
                System.out.println("equal");
            }


        }


        String[] liste = {"AA", "BB", "CC", "BB", "CC", "AA"};

        TreeSet aa = new TreeSet<>(Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA"));
        System.out.println(aa);



    }
}
