package day09_NestedIf_Ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 100;
        int min = num1 < num2 ? num1 : num2;
        System.out.println(min);

        System.out.println("======================");

        int hour = 19;
        String result = (hour <= 12) ? "Good morning" : (hour > 12 && hour < 18) ? "Good Afternoon" : "Good Evening";
        System.out.println(result);

        System.out.println("======================");

        int number =12000;

        boolean divisibleBy3And5 =(number%3 == 0 && number%5==0)? true:false;
        System.out.println(divisibleBy3And5);


    }
}
