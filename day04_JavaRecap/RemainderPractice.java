package day04_JavaRecap;

public class RemainderPractice {

    public static void main(String[] args) {
        // 1897651 is odd
        int number = 87654 ;

        boolean oddNumber = number % 2 != 0;  // for odd numbers
        boolean evenNumber = number % 2 == 0;  // for even number

        boolean divisibelBy3 = number % 3 == 0; // divisble by 3
        boolean divisibelBy5 = number % 5 == 0;

        System.out.println("The number "+number+" is odd number: " + oddNumber );
        System.out.println("The number "+number+" is even number: " + evenNumber );
        System.out.println("The number "+number+" is divisible by 3: "+divisibelBy3);
        System.out.println("The number "+number+" is divisible by 5: "+divisibelBy5);





    }
}