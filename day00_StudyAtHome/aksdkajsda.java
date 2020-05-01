package day00_StudyAtHome;

import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.Arrays;

public class aksdkajsda {

    public static void main(String[] args) {

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list5.set(0, list5.get(4));
        list5.set(4, list5.get(0));
        System.out.println(list5);

        ArrayList<Character> list = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            list.add(i);

        }
        boolean result = list.containsAll(Arrays.asList('a', 'c', 'D'));
        System.out.println(result);

        ArrayList<Integer>lis=new ArrayList<>();
        lis.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for(Integer each:lis){
            if(each %2 !=0){
                continue;
            }
            System.out.println(each+"");
            break;
        }
    }
}
