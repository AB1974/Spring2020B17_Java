package day42_Inheritance;

public class Data {

    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "defaultData";
    private static String privateData = "privateData";
}

class Testing extends Data{

    public static void main(String[] args) {
        /**
         * public is inherited
         * default is inherited
         * protected is inherited
         * private is NOT inherited
         */

        System.out.println(Testing.defaultData);
        System.out.println(Testing.protectedData);
        System.out.println(Testing.publicData);
       // System.out.println(Testing.private);// NEVER EVER
    }

}