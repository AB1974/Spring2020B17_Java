package day09_NestedIf_Ternary;

public class TernaryPractice {
    public static void main(String[] args) {
        int number = 100;
        char ch1 = ' ';
        if (number > 0) {
            ch1 = '+';
        } else if (number < 0) {
            ch1 = '-';
        } else {
            ch1 = '0';
        }
        //TERNARY//
        char ch2 = (number > 0) ? '+' : (number < 0) ? '-' : '0';
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("=============================");

        byte score = 90;
        String grade = " ";

        if (score >= 90 && score <= 100) {
            grade = "Excellent";
        } else if (score >= 80 && score < 90) {
            grade = "Great";
        } else if (score >= 70 && score < 80) {
            grade = "Good";
        } else if (score >= 60 && score < 70) {
            grade = "pass";
        } else if (score < 60 && score > 0) {
            grade = "Failed";
        } else {
            grade = "Invalid";
        }

        System.out.println(grade);


        String grade2 = (score >= 90 && score <= 100) ? "Excellent" : (score >= 80 && score < 90) ? "Great"
                : (score >= 70 && score < 80) ? "Good" : (score >= 60 && score < 70) ? "Pass" : (score < 60 && score > 0) ?
                "Failed" : "Invalid" ;

        System.out.println(grade2);
    }
    }

