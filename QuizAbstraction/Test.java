package QuizAbstraction;


import java.util.NoSuchElementException;

class NoSuchWebDriverException extends RuntimeException {
    public NoSuchWebDriverException() {
        super("There is no such web driver");
    }
}

public class Test {

    public static void main(String[] args) {

        getDriver("Safari");
    }

    public static void getDriver(String Browser) {
        switch (Browser) {
            case "chrome":
                System.out.println("chrome Browser");

            case "firefox":

                System.out.println("firefox");
                break;
            default:
                throw new NoSuchWebDriverException();
        }
//Result no suchWEbDriverException will be thrown
    }

}
