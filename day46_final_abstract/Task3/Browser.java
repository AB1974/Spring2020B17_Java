package day46_final_abstract.Task3;

/**
 * Task03:
 * 1. create an abstract class called Browser
 * Attributes: browserName
 * methods:
 * abstract methods: get(URL), close(), maximize();
 * 2. create three sub classes of Browser:
 * 1. ChromeBrowser
 * 2. FireFoxBrowser
 * 3. OperaBrowser
 * each class MUST have constructors to initialize the attributes
 * each actions should ONLY be applicable to the object it's called from
 * Ex:
 * chrome.get("https://www.google.com")
 * output should be: chrome browse is opening https://www.google.com
 * (it should not open the URL in different browser other than chrome)
 */
public abstract class Browser {

    String browserName;

    public Browser(String browserName) {
        this.browserName = browserName;
    }

    public abstract void getURL(String url);

    public abstract void close();

    public abstract void maximize();

    public String toString() {
        return "Browser name is: " + browserName;
    }
}

class Chrome extends Browser {

    public Chrome(String browserName) {
        super(browserName);
    }


    public void getURL(String url) {

        System.out.println(browserName + "browser is opening ");

    }

    ;


    public void close() {

        System.out.println(browserName + " is closing");
    }

    ;


    public void maximize() {

        System.out.println(browserName + " maximizes");

    }

    ;


}

class Firefox extends Browser {

    public Firefox(String browserName) {
        super(browserName);
    }

    public void getURL(String url) {

        System.out.println(browserName + "browser is opening ");

    }

    ;


    public void close() {

        System.out.println(browserName + " is closing");
    }

    ;


    public void maximize() {

        System.out.println(browserName + " maximizes");

    }

    ;

}

class Opera extends Browser {

    public Opera(String browserName) {
        super(browserName);

    }

    public void getURL(String url) {

        System.out.println(browserName + "browser is opening ");

    }

    ;


    public void close() {

        System.out.println(browserName + " is closing");
    }

    ;


    public void maximize() {

        System.out.println(browserName + " maximizes");

    }

    ;
}

class BrowserObjects {
    public static void main(String[] args) {
        Chrome obj1 = new Chrome("https://www.google.com");
        obj1.getURL("https://www.google.com");
        obj1.maximize();
        obj1.close();
        System.out.println(obj1);

        Firefox obj2 = new Firefox("https://firefox.com");
        obj2.getURL("https://firefox.com");
        obj2.maximize();
        obj2.close();
        System.out.println(obj2);

        Opera obj3 = new Opera("https://opera.com");
        obj3.getURL("https://opera.com");
        obj3.maximize();
        obj3.close();
        System.out.println(obj3);
    }
}