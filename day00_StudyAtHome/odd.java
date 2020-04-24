package day00_StudyAtHome;

public class odd {

    public static void main(String[] args) {

int sumOfOdd=0;
int sumOfEven=0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};

        for(int each:arr){

            if(each%2==0){
                sumOfEven+=each;
                System.out.println("Even numbers : "+each);
            }else{
                sumOfOdd+=each;
                System.out.println("Odd numbers : "+each);
            }
        }
        System.out.println("Sum of even : "+sumOfEven);
        System.out.println("Sum of odd : "+sumOfOdd);


        System.out.println("------------------------------");


        int[] numbers = new int[81];


        for (int i = 80; i >= 0; i--) {//80,79,78,77,....0

            numbers[80 - i] = i;

        }

        for (int each : numbers) {

            if (each % 2 == 1 || each < 20) {
                continue;
            }


            System.out.print(each + " ");


        }
    }

        }






