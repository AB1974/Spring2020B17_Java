package day44_Exceptions;

public class Practice {
    /**
     * print hello
     * wait two seconds
     * print cybertek
     * wait three seconds
     * print java
     */
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("Cybertek");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        System.out.println("Java");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }

    }
}
