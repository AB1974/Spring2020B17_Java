package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println("Name is: " + PersonalInfo.name);//those are public
        System.out.println("Gender is: " + PersonalInfo.gender);//those are public

        // System.out.println("Grade is: "+PersonalInfo.grade);//because private it can be accessible in the same class
        // System.out.println("SSN is: "+PersonalInfo.SSN);////because private
        // System.out.println("ID is: "+PersonalInfo.ID);////because private
        // System.out.println("AGE is: "+PersonalInfo.age);////because private

        System.out.println("Grade is: " + PersonalInfo.grade);//default is accessible in the same package
        System.out.println("Grade is: " + PersonalInfo.age);//default is accessible in the same package

        PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.grade);//we are calling grade (static through the object !
        System.out.println(obj.name);//static but we are calling through the object name!
        System.out.println(obj.age);//
       // System.out.println(obj.SSN);this is private we can not access through the clss
    }
}
