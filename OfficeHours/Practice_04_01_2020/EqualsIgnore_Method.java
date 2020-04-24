package OfficeHours.Practice_04_01_2020;

public class EqualsIgnore_Method {

    public static void main(String[] args) {

        //equalsIgnoreCase method ignores case sensitivity!


        String s1 = "cat";
        String s2 = new String("cat");
        String s3 = "Cat";
        System.out.println(s1 == s2);//false memory locations are different
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equalsIgnoreCase(s1));


    }

}
