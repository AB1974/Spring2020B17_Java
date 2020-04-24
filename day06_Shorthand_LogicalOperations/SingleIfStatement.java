package day06_Shorthand_LogicalOperations;

public class SingleIfStatement {
    public static void main(String[] args) {


        boolean coldWeather=true;
        if(coldWeather){
            System.out.println("wear your jacket");
            System.out.println("wear your hat");
        }

       // if(Condition has to be boolean expression){}
        //if(boolean expression){}
            //if the condition is true codes has to be executed if not codes can not be executed.

        boolean coronaDetected=true;

        if(coronaDetected){

            System.out.println("buy more toilet papers");
            System.out.println("buy more water");
            System.out.println("stay at home");
            System.out.println("do more java coding");

        }
        int a=201;
        boolean evenNumber =a%2==0; //if a number can be divided by 2 without the remainder
        //boolean oddNumber=a%2!=0;// //if a number can not be divided by 2 without the remainder


        if(evenNumber){
            System.out.println(a+" is even number");


        }
        if(!evenNumber){//if the number is not even number then it must be odd
            System.out.println(a+" is odd number");


        }





    }
}
