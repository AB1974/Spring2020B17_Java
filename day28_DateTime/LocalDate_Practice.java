package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    /*
    Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
     */

    public static void main(String[] args) {

        String[] friends={"Aylin","Engin","Arin"};

        LocalDate AylinBirthday= LocalDate.of(1974,4,6);
        LocalDate EnginBirthday=LocalDate.of(1965,6,29);
        LocalDate ArinBirthday=LocalDate.of(2004,9,20);

        LocalDate[]Birthdays={AylinBirthday,EnginBirthday,ArinBirthday};

        for(int i=0;i<friends.length;i++){
            String name=friends[i];
            LocalDate bd=Birthdays[i];
            System.out.println(name+"'s birthday is "+bd);

            System.out.println(friends[i]+"s birthday is "+Birthdays[i]);

        }


    }
}
