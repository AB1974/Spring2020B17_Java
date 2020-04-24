package day14_StringClass;

public class StringManupilations3 {

    public static void main(String[] args) {

        System.out.println("=========EqualsIgnoreCase=======");
            String str1 = "CYBERTEK";
            String str2 = "cybertek";

            System.out.println( str1.equals(str2) ); // false

            System.out.println(str1.equalsIgnoreCase(str2) ); // true, ignores case sensitivity

        System.out.println("=========contains method============= ");

        String s1 ="Cybertek School";
        boolean r1 =s1.contains("School");//true
        System.out.println(r1);

        System.out.println("=====task================");

        /*
        valid password must contain a special characters such as (!,_,$).
        valid password should not contain spaces.


         */

        String PassWord = "mmasd 12345";

        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it ");}
        else{
            System.out.println("valid password");}

        System.out.println("=========StartsWithMethod======");

        String s3 ="UnitedStates";

        System.out.println(s3.startsWith("U"));


        }


    }

