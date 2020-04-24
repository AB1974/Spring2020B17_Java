package day13_StringClass;

public class StringManupilations3 {
    public static void main(String[] args) {

        System.out.println("=========IndexOf==========");

        String str = "I like Java programming John";
        //          01234567
        int num1 = str.indexOf("John");//index number of J is 7 //it will return only first matching character as an int !
        System.out.println(num1);

        String str2 = "Cybertek school is awesome";
        //0123456789
        int num2 = str2.indexOf("s");
        int seconds = str2.indexOf("is") + 1;
        //returns the index number of i//
        System.out.println(num2);
        System.out.println(seconds);

        int maxIndexNumber = "Cybertek".length();//maximum index number -1 of length
        System.out.println(maxIndexNumber - 1);

        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);

        String fullName = "Aylin Bekem";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println(firstName);
        System.out.println(lastName);





    }
}
