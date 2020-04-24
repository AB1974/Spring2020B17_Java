package Quizz;



public class Batch12AssesmentQuiz3 {
    public static void main(String[] args) {
        //Q1
        int num = 9;

        if (num++ == 10) {
            System.out.println("Hello World " + num);
        } else {
            System.out.println("Hello Universe " + num);
        }
        //what is output?
        System.out.println("============================");
        //Q2
        int score = 0;

        if (score == 0) {
            score += 50;
        }
        if (score != 0) {
            score += 50;//50+50 =100
        }
        System.out.println(score);
        System.out.println("============================");
        //Q3
        char grade = 'A';
        boolean Passed = grade == 'A' || grade == 'B';
        //A==A   ||   A==B
        //true    ||  //false===>TRUE

        boolean Passed2 = grade == 'C' || grade == 'D';
        //A==C   ||    A==D
        //false  ||    //false  ====>FALSE

        if (Passed || Passed2) {
            //true||false====>TRUE

            System.out.println("You've passed the exam");
        } else {
            System.out.println("You failed");
        }
        System.out.println("========================");

        //Q4

        boolean A = true, B = !false;
        //
        if (B) {
            System.out.println("B");//true
        } else if (A) {
            System.out.println("A");//true but else if blocks only one if statement is executed! (first if statement)
        } else {
            System.out.println("C");

        }
        System.out.println("========================");
        //Q5
        boolean result1 = true;
        if (result1) {
            System.out.println("it's true");
        } else {
            System.out.println("it's false");
            /*
            }else if{result1){
            System.out.println("None of the above");}
            *compile error* because else statement is closure statement
             */

        }
        System.out.println("======================================");
        //Q6
        //In multi branch if statement we can give as many"else if statement as we want!
        //Q7
        //When we declare if statement it'is NOT mandatory to give else block !
        //Q8
        boolean A1 = true, B1 = !A;
                //true       //false

        if (A1)
        //true
        {
            if (B1)
            //false ANSWER IS TUESDAY
            {
                System.out.println("monday");
            } else {
                System.out.println("tuesday");
            }
        }else {
         //never gets executed because B1 definition is false.
            if (A1) {
                System.out.println("thursday");
             }else {
                System.out.println("friday");
             }
        }
        System.out.println("=======================");
        //Q9

        int number=10;
        if(--number>10){
            System.out.println("Hello Cybertek"+number);
        }else if(number==9){
            System.out.println("Hello World "+number);
        }
        System.out.println("=============================");
        //Q10
        boolean X=true;
        boolean Y=!X==false;
        //         false==false==> TRUE
        boolean Z=Y;//TRUE

        if(X) {
            System.out.println("Hello everypne ");
        }if(Y) {
            System.out.println("Today is a great day");
        }if(Z){
            System.out.println("We have picnic on Saturday");}



    }
}