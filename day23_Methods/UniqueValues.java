package day23_Methods;

public class UniqueValues {

    public static void main(String[] args) {
        /*

            1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
         */
        String[] arr2 = {"A", "B", "A", "C", "D", "E", "F", "B"};

        for(String each1:arr2){


            int count2 = 0;

            for (int i = 0; i < arr2.length; i++) {

                if (arr2[i].equals(each1)) {

                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(each1);
            }
        }



        System.out.println("============================");


        String[] arr = {"A", "B", "A", "C", "D", "E", "F", "B"};


        for (String each2 : arr) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);//unique characters

            }
        }
    }
}