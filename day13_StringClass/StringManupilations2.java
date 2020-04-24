package day13_StringClass;



public class StringManupilations2 {

    public static void main(String[] args) {

        System.out.println("=========Substring============");

        String str = "Cybertek School is the best";//you need to give in beginning index till the ending index
        // (ending index is excluded)
        //012345678
        String SchoolName = str.substring(0, 8);
        System.out.println(SchoolName);

        String fullName = "Kuzzat Altay";
        //               01234567891011
        String firstName = fullName.substring(0, 6);
        String lastName = fullName.substring(7, 12);
        System.out.println(firstName);

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println("=========example");

        //full name =firstname last name
        //gmail:lastName_firstname@gmail.com

        String Murteza = "Murteza Nazeeri";

        String firstname = Murteza.substring(0, 7);
        System.out.println(firstname);
        String lastName1 = Murteza.substring(8, 15);
        System.out.println(lastName1);

        String gmail = lastName1.concat("_").concat(firstname).concat("@gmail.com");
        //String gmail=lastName1+"_"+firstname+"@gmail.com";

        System.out.println(gmail);

        String s1 = "I LOVE JAVA PROGRAMMING LANGUAGE";
        //         01234567
        System.out.println("===============OTHER FORMS OF SUBSTRING======= ");
        String className = s1.substring(7);
        System.out.println(className);

        System.out.println("========REPLACE METHOD ======");

        String s2 = "I love C# Programming C#,C#";

        s2 = s2.replace("C#", "JAVA");
        System.out.println(s2);//new value will be replaced ALL old valueS.

        String name = "COVID 18";
        name = name.replace("8", "9");
        System.out.println(name);

        System.out.println("========REPLACE FIRST=========");

        String r1 = "I like C#,C# is fun ,C# is cool";
        r1 = r1.replaceFirst("C#", "JAVA");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);





    }
}
