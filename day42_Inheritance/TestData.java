package day42_Inheritance;
/*
    public: accessible at everywhere, visible to the world
    protected: visible in same package, visible in sub class outside package
    protected is always visible to any subclass
    default: only visible in same package
    private: only visible within the same class
 */

public class TestData extends Data {
    /**
     * public inherited from Data class can be inherited to any subclass
     * protected inherited from Data class can be inherited to any subclass
     * default inherited from Data class can be inherited to any subclass if sub class  in the same package
     */

    public static void main(String[] args) {
        System.out.println(TestData.publicData);// we are calling static variable through class name//
        System.out.println(TestData.defaultData);// we are calling static variable through class name//
        System.out.println(TestData.protectedData);// we are calling static variable through class name//
        //    System.out.println(TestData.privateData);// it's private can never be inherited!

    }

}
