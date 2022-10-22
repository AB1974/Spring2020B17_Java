package OfficeHours.day_6_CustomClasses;

public class User2 {
    public static void main(String[] args) {
        FacebookUser user = new FacebookUser("jbond5", "007", "James Bond");
        user.createPost("My first Post");
        user.createPost("Today was good");
        user.createPost("Dinner time");
        System.out.println(user.getAllPosts());
    }
}
