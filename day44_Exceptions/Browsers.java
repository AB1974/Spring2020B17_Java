package day44_Exceptions;

/**
 * warmup task:
 * 1. create a class called Browsers
 * actions: openBrowser(): opens the default browser
 * closeBrowser(): closes the default browser
 * 2. create a class called ChromeBrowser
 * actions: openBrowser(): opens the chrome browser
 * closeBrowser(): closes the chrome browser
 * 3. create a class called FirefoxBrowser
 * actions: openBrowser(): opens the Firefox browser
 * closeBrowser(): closes the Firefox browser
 * 4. create a class called Opera browser
 * actions: openBrowser(): opens the Opera browser
 * closeBrowser(): closes the Opera browser
 * 5. create a class called Test:
 * create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {

    protected void openBrowser() {
        System.out.println("Openning the default browse");
    }

    protected void closeBrowser() {
        System.out.println("Closing the default browser");
    }
}

class ChromeBrowser extends Browsers {
    @Override
    public void openBrowser() {
        System.out.println("Opening the Chrome browse");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome browse");
    }

}

class FireFoxBrowser extends Browsers {
    @Override
    protected void openBrowser() {
        System.out.println("Opening the FireFox browse");
    }

    @Override
    protected void closeBrowser() {
        System.out.println("Closing the FireFox browser");
    }

}

class OperaBrowser extends Browsers {
    @Override
    public void openBrowser() {
        System.out.println("Opening the Opera browse");
    }

    @Override
    protected void closeBrowser() {
        System.out.println("Closing the Opera browser");
    }
}

class Test {
    public static void main(String[] args) {

        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();

        FireFoxBrowser obj1 = new FireFoxBrowser();
        obj1.openBrowser();
        obj1.closeBrowser();
        OperaBrowser obj2=new OperaBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();

    }

}