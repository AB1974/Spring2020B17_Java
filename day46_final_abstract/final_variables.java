package day46_final_abstract;

public class final_variables {


    final int InstanceVariable = 300;//you need to assign instance variable immediately

    final static int staticVariable = 1000;
    final static int staticvariables2 = 200;

    public static void main(String[] args) {

        final double PI = 3.14;//can not be changed

        final String gender = "male";

        final int score;
        score = 100;
        System.out.println(score);

        final_variables obj = new final_variables();
        //    obj.InstanceVariable = 200; you can not reassign because it was declared as final

        System.out.println(staticvariables2);

    }
}
