package day01_FirstJavaProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SelfStudyStream3 {

    public static void main(String[] args) {

        String pal ="Adanada";
        String palrev ="";

        String arr [] = pal.split("");

        for ( int i=arr.length-1 ; i>=0 ; i--){

            palrev +=arr[i];
        }
        Boolean bool= pal.equalsIgnoreCase(palrev);
        System.out.println("bool = " + bool);



        Integer numbers  [] ={5,6,7,90,2};

        List<Integer> ls = new ArrayList<>(Arrays.asList(numbers));
        //ascending
        ls=ls.stream().sorted().collect(Collectors.toList());
        System.out.println("ls = " + ls);
        
        //descending
        
        ls=ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ls = " + ls);
        
        
        //filter 

        List<String > names2 = new ArrayList<>(Arrays.asList("Aylin","Bob","George"));
        List<String>names3=names2.stream().sorted().filter(m->m.length()==3).collect(Collectors.toList());
        Collections.sort(names3);
        Collections.reverse(names3);
        System.out.println("names2 = " + names3);

        String name4 ="Faruk";
        StringBuilder b =new StringBuilder(name4);
        System.out.println("b.reverse() = " + b.reverse());
        
        
        List<Integer> listv= new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7,8));
        
        listv= listv.stream().map(m->m*m).collect(Collectors.toList());
        System.out.println("listv = " + listv);
        
        
        


    }
}
