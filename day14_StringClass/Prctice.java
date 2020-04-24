package day14_StringClass;

public class Prctice {
    public static void main(String[] args) {


        System.out.println("========= EQUALSIGNORECASE============");//this does not key sensitive

        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);  // true

        if (result) {
            System.out.println("Logged in");
        }
        System.out.println("==========StartWithMethod===============");

        /*
        every website has "http" at the beginning of the address
         */
        String WebAddress = "www.amazon.com";

        if (WebAddress.startsWith("www.")) {
            System.out.println("valid");

        }
        System.out.println("=======EndWithMethod============");

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));//true
        System.out.println(s4.endsWith("School"));//true
        System.out.println(s4.endsWith("Cybertek"));//false

        //everysingle gmail adress ends with gmail.com

        System.out.println("=========example===============");
        String email = "CybertekSchool@yahoo.com";

        if (email.endsWith("gmail.com")) {
            System.out.println("valid Gmail");
        } else {
            System.out.println("invalid Gmail");
        }

        System.out.println("=======example=========");




    }
}
