package day10_Switch_Scanner;

public class days {
    /*
	2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

     */
    public static void main(String[] args) {
        //valid number for the day
        int day = 0;
        String result = "";

        if (day >= 1 && day <= 7) {
            result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" :
                    (day == 4) ? "Thursday" : (day == 5) ? "Friday" :
                    (day == 6) ? "Saturday" : (day == 7) ? "Sunday" : "Invalid";
        
        System.out.println(result);
    }
    else

    {
        System.out.println("invalid");
    }

}

    }



