package day12_JavaRecap;
import java.util.Scanner;
public class AscendingPractice {
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("Enter 3 different numbers");
        int num1=scan.nextInt(),
                num2=scan.nextInt(),
                num3=scan.nextInt();
        //451
        int temp = 1;


        if (num3>num2 && num3>num1){

            if(num1>num2 ) {
                temp= num1;//4,1,2
                num1=num2;
                num2=temp;
            }


        }else {
            if (num2>num1 && num2>num3){
                temp = num2;


            }


        }



        System.out.println(num1+" "+num2+" "+num3);
    }

}
