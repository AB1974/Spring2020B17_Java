package day35_Static;

public class staticVariables2 {


    int insVariable;    // every single object of the class has its own copy of instances
    static int staticVariable;   // there is only one copy of static shared by all objects

    public static void main(String[] args) {

        staticVariables2 obj1 = new staticVariables2();
        obj1.insVariable = 300;
        staticVariable = 400;//obj1.staticVariable = 400;

        staticVariables2 obj2 = new staticVariables2();
        System.out.println(obj1.staticVariable);
        staticVariable = 600;
        staticVariables2 obj3 = new staticVariables2();

        System.out.println(obj1.insVariable); // 300
        System.out.println(obj2.insVariable);   //0


        System.out.println();

        System.out.println(obj1.staticVariable);  // 400
        System.out.println(obj2.staticVariable);

        System.out.println("==========");
        //ONLY static can be call through the class name like in below.
        System.out.println(staticVariables2.staticVariable);
        // System.out.println(staticVariables2.insVariable);//WRONG instance can not be call through class name//ERROR

    }
}