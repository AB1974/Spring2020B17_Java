package day22_ArrayAndLoopPractices;

public class NestedLoops2 {
    public static void main(String[] args) {

        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1,0}};


/*
        numbers[0]==>{9,8,7}            numbers[0][i]//i needs to be repeated 3 times
         numbers[1]==>{6}               numbers[1][i]//i needs to be repeated once
          numbers[2]==>{5,4,3,2,1,0}    numbers[2][i]//i need to be repeated  6 times
 */

        for (int j = 0; j < numbers.length; j++) {

            for (int i = 0; i < numbers[j].length; i++) {

                System.out.print(numbers[j][i]+" ");//9,8,7
            }

            System.out.println();
        }
        //Homework
        //7,8,9,6,0,1,2,3,4,5 print
        //5,4,3,2,1,0,6,9,8,7
        //0,1,2,3,4,5,6,7,8,9

        for (int j = 0; j < numbers.length; j++) {

            for (int i = numbers[j].length - 1; i >= 0; i--) {

                System.out.print(numbers[j][i] + " ");//9,8,7
            }
          //int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1,0}};
            //{5,4,3,2,1,0} ,{6} {9,8,7} print formula is in below
            //        0       1     2
        }
        System.out.println();

        for (int k = numbers.length - 1; k >= 0; k--) {

            for(int i=0 ; i<numbers[k].length;i++){
                System.out.print(numbers[k][i]+" ");

            }

        }
        System.out.println("============");
        ////int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1,0}};
        //0,1,2,3,4,5,6,7,8,9 print

        for (int k = numbers.length - 1; k >= 0; k--) {

            for (int i = numbers[k].length - 1; i >= 0; i--) {

                System.out.print(numbers[k][i] + " ");
            }

        }

    }
}
