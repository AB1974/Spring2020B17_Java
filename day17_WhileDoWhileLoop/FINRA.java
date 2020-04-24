package day17_WhileDoWhileLoop;

public class FINRA {

    public static void main(String[] args) {

        /*
        //interview question;
        3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINRA

         */

        String result = "";

        for(int i = 1; i <= 30; i++){

            if( i % 3 ==0 && i % 5 ==0){  // prints the numbers that are divisible by both 3 & 5

                // System.out.print("FINRA"+" ");
                result += "FINRA "; // concatenation
            }else if( i % 3 == 0 ){  // prints the numebrs that are ONLY divisible by 3

                //  System.out.print("FIN"+" ");
                result += "FIN "; // concatenation
            }else if(i % 5 == 0 ){  // prints the numebrs that are ONLY divisible by 5

                // System.out.print("RA"+" ");
                result += "RA "; // concatenation
            }else{  // prints the numebrs that are not divisivle by either 3 or 5

                //  System.out.print(i+" ");
                result += i+" ";   // concatenation
            }

        }


        System.out.println(result);





    }


        }



