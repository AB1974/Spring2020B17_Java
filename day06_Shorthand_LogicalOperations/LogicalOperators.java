package day06_Shorthand_LogicalOperations;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean result1=true;

        System.out.println(!result1);//false

        boolean result2 = !(10+15>15); //false

        System.out.println(result2);

        boolean result3 =!true==!false;
        System.out.println(result3);

                    //false==true
                    //false

        //&&: and logic
        //false && false //false
        //true && false //false
        //true && true //true
        //the only time and logic is true is both conditions are true otherwise it return you false

        boolean R1 ="Corona Virus" !="End of the world" && "Toilet paper"=="Cure";

                    //true                                  //false
                    //false
        System.out.println(R1);

        boolean R2 = 10>15 && 15<13;
                    //false && false
                    //false
        System.out.println(R2);

        boolean R3 = 'a'=='b'-1 &&'b'+1=='c';
                    //97==98-1 && 98+1=99 true
        System.out.println(R3);

        /*
        //||: or logic
        //true || false //true
        9>8||10>12
        //false || true //true
        10!=10|| 10>9
        //true && true //true

        //false||false //false
        8>12||8<5
        //the only time OR logic is false  is both conditions are false otherwise it return you true.


         */
    boolean R4 =true !=false|| false ==!true;
                    //true ||true
                    //true
        System.out.println(R4);

        boolean R5 = true !=false && !false==!true;
                    //true && false
                    //false
        System.out.println(R5);


        boolean R6=!!!false;
        boolean R7=!!!!false;
                  //!!true
                  //!false
                   //true //
        System.out.println(R6);//if ! is odd which is 3 returns to opposite
        System.out.println(R7);//if ! is even which is 4 returns to same

        System.out.println((12 + 3) / 4 * 2);



    }
}
