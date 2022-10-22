package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {
        AccessModifiers obj1=new AccessModifiers();
      //  System.out.println(obj1.defaultAccess); not accessible
        System.out.println(obj1.publicAccess);//public is always visible in anywhere.
    }
}
