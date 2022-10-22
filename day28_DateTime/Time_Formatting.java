package day28_DateTime;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {

    public static void main(String[] args) {


        LocalTime time1 = LocalTime.of(16, 30);//16:30
        LocalTime time2 = LocalTime.of(9, 30);
        LocalTime time3 = LocalTime.of(12, 0);
        LocalTime time4 = LocalTime.of(0, 0);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(time1.format(dtf));
        System.out.println(time2.format(dtf));
        System.out.println(time3.format(dtf));
        System.out.println(time4.format(dtf));
        boolean result1 = time2.isAfter(time3);
        System.out.println(result1);

    }

}