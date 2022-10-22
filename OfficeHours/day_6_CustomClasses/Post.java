package OfficeHours.day_6_CustomClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * (*) Implement all methods coming from Social Media class
 * (*) Direct messaging(String username, String message)
 * - print = %message sent to %username
 * (*) Post(String body)
 * - Should be added to the the ArrayList of Posts of the user
 * (*) Notifications(int time)
 * - Checks the current time. If the time is between
 * 8 am - 5 pm print "Notification", otherwise print "Sleep mode"
 * (*) Override the toString method to print all of the
 * information of a Facebook user when they are searched.
 * Post class
 * (*) Create a class that has the following instance varible:
 * String body, and String dateTime
 * - Encapsulate body. Provide a public getter and setter(update)
 * - Make dateTime final and read only (getter)
 * (*) Create a constructor that will take the body
 * and initialize store it to the instance variable.
 * Upon creation of the post the current time should
 * be taken and stored into the dateTime variable
 * (*) Implement post method to create a post by
 * the given body and store it to the ArrayList of Posts of the user
 */
public class Post {

    private String body;
    private String dateAndTime;

    public Post(String body) {
        setBody(body);
        setDateAndTime();

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime() {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
        this.dateAndTime=dt.format(format);

    }

    @Override
    public String toString(){

        return body+"\n" +dateAndTime;
    }
}
