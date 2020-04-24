package Repplit_Solutions;
import java.util.*;
/*
In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM


1. Declare variables: hour, minute, second that can hold int values.
    Declare amOrPm variable that can hold a String ("AM" or "PM")

2. Instructor will set different values to your variables

3. Using the variables and concatenation, print values in the format mentioned above.
 */
public class repplit020 {
    public static void main(String[] args) {
        int hour =12;
        int minute=24;
        int second=33;
        String amOrPm ="AM,PM ";

        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();

        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);
    }
}
