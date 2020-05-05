package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Siamese", "Brown", 4, "Pity");

        System.out.println(cat1);//this one is using toString method!

        Cat cat2 = new Cat();
        cat2.setCatInfo("Scottish", "Beige", 2, "Bobo");
        System.out.println(cat2);

        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico", "White", 1, "Poor");
        System.out.println(cat3);

        System.out.println("==================");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1, cat2, cat3));

        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i));
        }
        System.out.println("=======================");
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("=====================");
        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("kebap");
        System.out.println("====================");
        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("wine");

    }
}
