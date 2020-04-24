package day24_Methods02;

public class ReturnPractice {
    //"VOID METHOD"
    /*
    1) Method AddVoid
       Return Type: Void
       Params:int num1,int num2
        add them and print sum
     */

    public static void main(String[] args) {

        //AddVoid(5, 4);

        //this below line will not work because it just perform an action !
        //int result=AddVoid(5,1);
        int result= Add(4,8);
        System.out.println("Result "+result);
        result=Add(10,30);
        System.out.println("Result "+result);
        System.out.println(Add(4,6));

    }

    public static void AddVoid(int num1, int num2) {//it does not return a value.

        int sum = num1 + num2;
        System.out.println("sum is :" + sum);
 /*1) Method Add
    Return Type: int
    Params:int num1,int num2
    add them and return sum
     */

        }

    public static int Add(int num1, int num2) {

        int sum = num1 + num2;
        return sum;


    }

/*
multiply with return value
minus with return value
divide with return value
 */

    public static double multiply(double num1,double num2){

        double result =num1*num2;
        return result;
    }

    public static double minus(double num1,double num2){

        double result =num1-num2;
        return result;
        //return num1-num2;
    }
    public static double divide(double num1,double num2) {
        if (num2 == 0) {
            System.out.println("error: cannot / by 0");
            return 0;
        } else{

        }
        double result = num1 / num2;
        return result;
    }
    }

