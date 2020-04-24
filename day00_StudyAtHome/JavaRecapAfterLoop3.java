package day00_StudyAtHome;
import java.util.Scanner;
public class JavaRecapAfterLoop3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max=0;//-99999999(you can work with negative numbers as well
        for(int i=1;i<=5;i++){
            System.out.println("Enter your number");
            int MaxNum = scan.nextInt();
            if(MaxNum>max){
                max=MaxNum;
            }
        }
        System.out.println("max value is :"+max);
    }
}
