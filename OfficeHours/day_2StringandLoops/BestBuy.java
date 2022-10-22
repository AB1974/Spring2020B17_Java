package OfficeHours.day_2StringandLoops;

public class BestBuy {

    String location;//these belongs to
    int numberOfEmployees;
    String phoneNumber;
    static int numberOfComputer;//belongs to all Best Buy

    public void close() {//instance method//belongs to each object

        System.out.println("This best buy is closed");

    }

    public static void closeAll(){
        System.out.println("All are closing");
    }
}
