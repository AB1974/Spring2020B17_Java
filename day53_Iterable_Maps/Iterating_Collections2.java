package day53_Iterable_Maps;

import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {

            if (it.next().toLowerCase().contains("m")) {
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("============");

        System.out.println(names.removeIf(p -> p.contains("m") || p.contains("M")));

        System.out.println(names);

        System.out.println("==============");
        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet",
                "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));


        for (Iterator<String> it1 = students.iterator(); it1.hasNext(); ) {
            if (it1.next().toLowerCase().contains("m")) {
                it1.remove();
            }


        }
        System.out.println(students);

        System.out.println("===================");
        LinkedHashSet<String> ss = new LinkedHashSet<>();
        ss.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet",
                "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));

        ss.removeAll(Arrays.asList("Mehmet", "Ozgur", "Mohammed"));

        System.out.println(ss);

        System.out.println("=======================");

        LinkedHashSet<String> sss = new LinkedHashSet<>();
        sss.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet",
                "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));

        sss.retainAll(Arrays.asList("Yucel", "Sha", "Ahmet"));
        System.out.println(sss);

        System.out.println("========================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7));

        //verify 5,6,9,8 are contained in the lst

        System.out.println( list.containsAll(Arrays.asList(5,6,9,8)));















    }
}
