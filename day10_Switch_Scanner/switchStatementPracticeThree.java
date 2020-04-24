package day10_Switch_Scanner;

public class switchStatementPracticeThree {

        public static void main(String[] args) {

            char ch ='C';
            String result = ""; //ABCDInvalid

            switch(ch){
                case 'A':
                    System.out.println("A");
                    //  result += "A";

                case 'B':
                    System.out.println("B");
                    //   result += "B";


                case 'C':
                    System.out.println("C");
                    //  result += "C";

                case 'D':
                    System.out.println("D");
                    //  result += "D";

                default:
                    System.out.println("Invalid");
                    //  result += "Invalid";
            }

            // System.out.println(result);


        }
}
