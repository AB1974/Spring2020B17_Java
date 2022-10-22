package OfficeHours.Practice_05_27_2020;

public class MethodOverriding {

    public void method1() {
        System.out.println("super class");
    }
}
    class Test extends MethodOverriding {

        public void method1() {
            System.out.println("Sub class");
        }



    public static void main(String[] args) {
        Test obj = new Test();
        obj.method1();

        MethodOverriding obj1=new MethodOverriding();
        obj1.method1();
    }

}
