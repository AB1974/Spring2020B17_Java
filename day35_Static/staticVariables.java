package day35_Static;

public class staticVariables {
    int a2 = 200;//instance variable


    static int a3 = 300;//static variable


    public static void main(String[] args) {
        int a1 = 100; //local variable

        staticVariables obj1 = new staticVariables();
        obj1.a2 = 1000;//every object has own copy

        obj1.a3=4000;

        staticVariables obj2 = new staticVariables();
        obj2.a2 = 2000; //every object has own copy
        obj2.a3=5000;


        System.out.println(obj1.a2);//1000
        System.out.println(obj2.a2);//2000

        System.out.println(obj1.a3);//5000//there is one copy of static variable therefore 5000
        System.out.println(obj2.a3);//5000


    }
}
