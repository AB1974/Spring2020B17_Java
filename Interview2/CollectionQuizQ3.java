package Interview2;

import java.util.*;

public class CollectionQuizQ3 {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        for (int i = 10; i < 80; i += 10) {
            st.add(i);

        }
        int num = st.pop();

        System.out.println(num);//70
        System.out.println("==================");

        Integer[] arr = {10, 10, 20, 20, 30, 30, 30, 100};
        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(arr));
        Set<Integer> linkedhashset = new LinkedHashSet<>();
        for (int each : list) {
            linkedhashset.add(each);
        }
        System.out.println(linkedhashset);//10,20,30,100 no duplicates keep insertion order
    }


}
