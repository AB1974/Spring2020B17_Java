package Interview;

import java.util.ArrayList;
import java.util.List;

public class arry {

    public static <E> void print(E[] any) {
        for (E element : any) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] a = {25, 45, 67};
        List lst = new ArrayList();
        lst.add(1);
        lst.add("asd");


        System.out.println(lst);;
    }
}
