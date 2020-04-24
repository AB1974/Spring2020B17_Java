package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray_ReverseArray {

    public static void main(String[] args) {

        int a = 100;
        int[] arr = {100, 200, 300};
        //            0    1     2

        System.out.println( arr[1] ); // 200

        for(int i = 0; i < 3; i++ ){  // i: index num of elemnts
            //  System.out.println(i);
            int num =   arr[i];
            System.out.println(num);
        }

        System.out.println("===========================================");

        int j = 0;
        while(j < 3){
            int num = arr[j];
            System.out.println(num);
            j++;
        }


        System.out.println("===========================================");
        String[] names = {"John", "Aaron", "Luoise", "Muhtar"}; // 3
        //                  0        1         2        3

        int length = names.length; //3
        String[] namesRev = new String[length];  // {null, null, null}
        //                                            0     1     2
           /*
                //       i          k
                namesRev[0] = names[2];
                namesRev[1] = names[1];
                namesRev[2] = names[0];
              */


               int k =  length-1;
               for(int i = 0; i < length; i++ ){
                   namesRev[i] = names[k];
                   k--;
               }

        /*int i =0;
        int k = length-1; // max index number
        while(i < length){

            namesRev[i] = names[k];
            i++;
            k--;
        }
*/

        System.out.println(Arrays.toString( namesRev ) );

    }
}
