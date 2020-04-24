package day26_MethodOverloading;

public class MethodOverloading2 {

    //first method :print some of two int numbers
         //second method:print some of three int numbers
            //third method:print the sum of four int numbers
    public static void main(String[] args) {
        sum2Numbers(3,2);
        sum3Numbers(4,5,5);
        sum4Numbers(3,6,6,7);
    //======OVERLOADING METHOD=SEE IN BELOW =========
        sum(3,2);
        sum(4,5,5);
        sum(3,6,6,7);
    }

    public static void sum2Numbers(int a, int b) {

        System.out.println(a + b);
    }

    public static void sum3Numbers(int a,int b,int c){

        System.out.println(a+b+c);

    }
    public static void sum4Numbers(int a,int b,int c,int d){

        System.out.println(a+b+c+d);

    }
    //===============WITH OVERLOADING METHOD=SEE IN BELOW ===========

    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
}
