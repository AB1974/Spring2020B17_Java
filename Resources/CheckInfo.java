package Resources;

import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);//public we can access name
        System.out.println(PersonalInfo.gender);//public we can access gender
        //System.out.println(PersonalInfo.grade);//default we can not see from another package
        //  System.out.println(PersonalInfo.SSN);//privare we can not access outside of the class
        PersonalInfo obj1 = new PersonalInfo();
        System.out.println(obj1.name);//we can call through the object! although variabe is static
        System.out.println(obj1.gender);//we can call through the object! although variabe is static
    }

}
