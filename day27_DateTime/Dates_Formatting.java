package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {
        //Date 2020-04-23==>apr 23
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");//default one!in java ( Yil,Ay,Gun)
        DateTimeFormatter dtfo = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));
        System.out.println(date1.format(dtfo));
        //year =yy,yyyy
        //month=MM,MMM
        //day=dd
        //days name :EEE(Thu) or EEEE(Thursday)
        DateTimeFormatter dtfoo = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(date1.format(dtfoo));

        /*
        create date called birthday pattern should be Month/Days/year//*Apr/23/20*
         */
        LocalDate birthday = LocalDate.of(1974, 04, 06);
        DateTimeFormatter birthday1 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");
        System.out.println(birthday.format(birthday1));//.format() methodu istedigin gibi basmani sagliyor.
        //String str1=birthday.format(birthday1));or
        ///MMM=APR, MMMM=APRIL,FULL NAME OF THE MONTH

        LocalDate date3=LocalDate.now();
        System.out.println(birthday1.format(birthday));

        
    }
}
