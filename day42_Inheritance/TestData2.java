package day42_Inheritance;

public class TestData2 extends AccessModifiers {
    /**
     * public variable inherited
     * protected variable inherited
     * default variable inherited
     * publicMethod() inherited
     * protectedMethod() inherited
     * defaultMethod() inherited
     *
     * private can NEVER be inherited!!!
     */

    public static void main(String[] args) {
        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);//default can be inherited because they are in the same package
        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();//if sub class outside of the package default variable or default method()can not be inherited!
    }

}
