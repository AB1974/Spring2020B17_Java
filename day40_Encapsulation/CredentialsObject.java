package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {


        Credentials facebook = new Credentials();

        facebook.setUserName("Ayin");
        facebook.setPassWord("Password");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());


    }

}
