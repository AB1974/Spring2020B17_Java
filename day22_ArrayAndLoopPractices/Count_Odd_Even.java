package day22_ArrayAndLoopPractices;

public class Count_Odd_Even {

    public static void main(String[] args) {

/*
4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};

        int countOddNumbers=0;
        int countEvenNumbers=0;


        for(int each:arr){

          if(each%2!=0){

              countOddNumbers++;
          }else{
              countEvenNumbers++;
          }


        }

        System.out.println("Even numbers: "+countEvenNumbers);
        System.out.println("Odd numbers: "+countOddNumbers);



    }
}
