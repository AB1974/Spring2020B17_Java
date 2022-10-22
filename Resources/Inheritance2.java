package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {
                //sub               //superclass

    /**
     * public  inheritance
     * protected inheritance
     * public ()method inheritance
     * protected ()method inheritance
     */
    public static void main(String[] args) {
        System.out.println( Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
      //  System.out.println(Inheritance2.defaultVariable);
        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
      //  Inheritance2.defaultMethod();

    }


}
