package OfficeHours.day_6_CustomClasses;

public class User {
    public static void main(String[] args) {
        FacebookUser user = new FacebookUser("Java5", "kesJava5da");
        System.out.println(user.getUserName());//in order to get private variables
        System.out.println(user.getPassword());

        FacebookUser user2=new FacebookUser("james","pass007","Jam7es Bond");
        System.out.println(user2.getUserName());
        System.out.println(user2.personalURL);
        System.out.println(user2.accountLength);
        user2.getFullName();
        System.out.println(user2.getFullName());
    }
}
