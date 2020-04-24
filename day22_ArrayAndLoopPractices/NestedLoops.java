package day22_ArrayAndLoopPractices;

public class NestedLoops {
    public static void main(String[] args) {


        //                  0    1      0   1     2      0    1    2   3
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H','I'}};
        //                  0           1               2
        //each index in arr2D MUST be single dimensional array.

                //arr2D[0]==>PRINT A,B

        for (int i = 0; i < arr2D[0].length; i++) {


            System.out.println(arr2D[0][i]);

        }

                 //arr2D[1]==>PRINT C,D,E

        for (int i = 0; i < arr2D[1].length; i++) {

            System.out.println(arr2D[1][i]);

        }

                 //arr2D[2]==>PRINT F,J,H,I

        for (int i = 0; i < arr2D[2].length; i++) {

            System.out.println(arr2D[2][i]);

        }
        System.out.println("======nested loop=============");

        for (int j = 0; j < arr2D.length; j++) {// j represent index numbers of 1 dimensional array
                                                //i represent index number of elements

            for (int i = 0; i < arr2D[j].length; i++) { //arr2D[0],arr2d[1],arr2D[2]

                System.out.println(arr2D[j][i]);

            }
        }



    }
}
