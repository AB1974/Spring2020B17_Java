package day26_MethodOverloading;

public class MethodOverloading4 {


    //any method in java overloaded//
                    //command line argument (String[] args)
    public static void main(String[] args) {//compiler knows this main method this one is executed!
        System.out.println("String");
    }

    public static void main(double[] args) {
        System.out.println("Double ");
    }

    public static void main(int[] args) {
        System.out.println("int");

    }
}
