package Quizz;

public class Batch12AssesmentQuiz4 {

    /*
    What s the result ?

     */

    public static void main(String[] args) {
        //Q1
        // int Value =1;//line 1
        /*switch (Value){//line 2

            case Value://Value gives an error constant expression//line 3
                System.out.println("One");
                break;
            default:
                System.out.println("invalid");
                //break
                Answer is compile error//line 3
                */
        System.out.println("===================================");

        //Q2
        //switch statement ( long float double boolean does not work with )
        //answer is compile error
        //long z=10;
        //switch (z){compile error
        System.out.println("==================================");
        //Q3
        //switch statement ( long float double boolean does not work with )
        //answer is compile error
        //double z=10;
        //switch (z){compile error
        System.out.println("==================================");
        //Q4
        //switch statement ( long float double boolean does not work with )
        //answer is compile error
        //float z=10;
        //switch (z){compile error
        System.out.println("===================================");
        //Q5
        //Boolean OPT=true;//it gives you compile error !//change with String "true" expression
        //switch (OPT){
        //case true:
        //System.out.println("one");
        //break;

        String OPT = "TRUE";
        switch (OPT) {
            case "TRUE":
                System.out.println("TRUE");
        }
        System.out.println("DONE");
        System.out.println("====================================");

        //Q6
        float f1 = (12_345.1 > 123_45.0) ? 12_456 : 124_56.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);
        System.out.println("===================================");
        //Q7
        float float1 = (1_560.00 > 12_60.00) ? 10 : 20;
        System.out.println(float1);
        System.out.println("====================================");
        //Q8

        int i = 10;
        int j = 20;
        int k = j += i / 5;
        //k=j+=2==>j=j+2==>j=22 k=22
        //
        System.out.println(i + " " + j + " " + k);
        System.out.println("=================================");

        //Q9
        Short s = 1;//byte ,short,int correct answer
        switch (s) {
            case 1:
                System.out.println("ONE");
                break;
        }
        System.out.println("===============================");
        //Q10
        int z=10;
        switch (z){
            case 10:
                System.out.println("monday");
            case 11:
                System.out.println("tuesday");
            default:
                System.out.println("friday");
        }

        System.out.println("=================================");
        /*boolean B= true;///////COMPILE ERROR////////
        switch (B){
            case true:
                System.out.println("monday");
            case false:
                System.out.println("tuesday");
            default:
                System.out.println("wednesday");
            */


        }

    }


