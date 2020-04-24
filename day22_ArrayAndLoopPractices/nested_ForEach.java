package day22_ArrayAndLoopPractices;

public class nested_ForEach {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int each : arr) {

            System.out.print(each + " ");
        }
        System.out.println("+++++++++++++");
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

        for (int[] each1DArray : arr2D) {

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);


            }

        }

        System.out.println("==============");


        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H'}};

        for (char[] each1DArray : ch2D) {

            for (char eachElement : each1DArray) {

                System.out.println(eachElement);
            }

        }






    }
}