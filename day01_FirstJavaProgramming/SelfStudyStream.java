package day01_FirstJavaProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SelfStudyStream {

    public static void main(String[] args) {
        //Intermediate operators   Sort & Map & Filter
        //sort & filter
        List<String> names = Arrays.asList("Aylin", "Bora", "Jack", "Colin","Bonny","Burke");
        List lst = names.stream().sorted().filter(c -> c.contains("B")).collect(Collectors.toList());
        System.out.println(lst);

        //Collections -> reversed()
        List<String> names2 = Arrays.asList("Aylin", "Engine", "Select", "Dove");
        Collections.sort(names2);
        Collections.reverse(names2);
        System.out.println("reversed names "+names2);

        //sorted- ascending
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 7, 9, 6);
        List ascending = list3.stream().sorted().collect(Collectors.toList());
        System.out.println("ascending = " + ascending);
        //sorted- descending-reverse order()
        List descending = list3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("descending = " + descending);
        
        //map 
        // method is used for returning result of given function to the elements of the stream
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> square = list1.stream().map(m -> m * m).collect(Collectors.toList());
        System.out.println("square = " + square);
        

        //Reverse
        String name = "Aylin";
        String array[] = name.split("");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println();

        //String builder
        String name1 = "Aylin";
        StringBuilder builder = new StringBuilder(name1);
        System.out.println(builder.reverse().toString());

        String name2 ="Aylin";
        String name3 []=name2.split("");
        List<String> rev = new ArrayList<>(Arrays.asList(name3));
        List rt1 = rev.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("rt1 = " + rt1);


        //Reverse methods
        String isim = "Abdulmecit";
        String[] arra= isim.split("");
        List<String> dd = Arrays.asList(arra);

        Collections.sort(dd);
        System.out.println("dd = " + dd);
        Collections.reverse(dd);
        System.out.println("dd = " + dd);

//Palindrome
        String word ="Adanada";

        String pal= "";

        for (int i=word.length()-1; i>=0; i--){

            pal+=word.charAt(i);

        }

        boolean b1= pal.equalsIgnoreCase(word);
        System.out.println("b1 = " + b1);





























    }
}
