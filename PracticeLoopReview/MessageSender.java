package PracticeLoopReview;
import java.util.Scanner;
public class MessageSender {

    public static void main(String[] args) {
       //Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        String PhoneNumber = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        String Message = message.substring(message.indexOf("{") + 1, message.indexOf("}"));

        System.out.println("Sender:" + sender);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Message Body: " + Message);
    }
}
