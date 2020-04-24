package day10_Switch_Scanner;

public class daysinamonths {
    /*

	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12

     */
    public static void main(String[] args) {
        //precondition :num (1~12)
        int num = 10;
        String result="";

        boolean days28 = num == 2;
        boolean days30 = num == 4 || num == 6 || num == 9 || num == 11;


        if (num > 0 && num < 13) {

           result=(days28)?"28 days":(days30)?"30 days":"31 days";

        }else{
            result="invalid";}
            System.out.println(result);

        }
    }

