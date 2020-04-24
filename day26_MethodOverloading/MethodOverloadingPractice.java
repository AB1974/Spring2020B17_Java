package day26_MethodOverloading;

public class MethodOverloadingPractice {


    public static void main(String[] args) {

       sum(10,20);//int numbers
        sum(10.0,20.0);//double numbers

        double num1=sum(10,15.5,5);
        System.out.println(num1);

    }
    //first method :can find the sum of two int numbers
    //second method:can find the sum of two double numbers

    public static void sum(int a , int b){
        System.out.println(a+b);
    }

    public static void sum(double a,double b){//does not return any value because is void method
        System.out.println(a+b);
    }
    public static double sum(double a,double b,double c){//return type does not matters only matters are parameters in overloading
        return a+b+c;

    }

}
