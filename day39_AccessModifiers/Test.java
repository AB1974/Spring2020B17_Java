package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessModifiers obj1 = new AccessModifiers();
        System.out.println(obj1.defaultAccess);//they are located in same package!its accessible
        System.out.println(obj1.publicAccess);//they are located in same package!open to the world
       // System.out.println(obj1.ssn);//private: access modifier its not accessible outside of class.
    }
}
