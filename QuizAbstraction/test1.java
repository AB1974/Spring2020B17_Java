package QuizAbstraction;

class NoHolidaysOffException extends Exception {
    public NoHolidaysOffException() {
        super("No such a break time");
    }
}

public class test1 {

    public static void main(String[] args) {
        String day = "Christmas Holiday";

        if (day.contains("Christmas") || day.contains("New Years")) {
           // throw new NoHolidaysOffException();//compilation fails at line 3
        }
        System.out.println("work done");
    }
}
