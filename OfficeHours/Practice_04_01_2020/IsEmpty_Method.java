package OfficeHours.Practice_04_01_2020;

public class IsEmpty_Method {
    public static void main(String[] args) {
        //checks if the string is empty or not !
        //if its EMPTY it returns TRUE
        //if its NOT EMPTY returns FALSE

        String str1 = "  ";//this string is not empty!

        boolean r1 = str1.isEmpty();
        System.out.println(r1);

        boolean r2 = !str1.isEmpty();
        System.out.println(r2);


    }
}
