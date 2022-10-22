package day45_Exceptions;

public class ThrowsKeyword {

    public static void sleep1() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }

    public static void sleep2() throws InterruptedException {//second way

        Thread.sleep(3000);

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Cybertek");
        sleep1();
        System.out.println("Java");

    }

    public static void sleep3() throws Exception {
        String[] arr = {"A"};
        main(arr);
    }

    public static void sleep4() {
        try {
            sleep3();
        } catch (Exception e) {
        }
    }
}