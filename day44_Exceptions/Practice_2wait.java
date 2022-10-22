package day44_Exceptions;

public class Practice_2wait {

    public static void main(String[] args) {
        System.out.println("Java");
        waits(5.5);
        System.out.println("Cybertek");
    }

    public static void waits(double seconds) {
        try {
            Thread.sleep((long) (seconds*1000));
        } catch (Exception e) {

        }
    }

}


