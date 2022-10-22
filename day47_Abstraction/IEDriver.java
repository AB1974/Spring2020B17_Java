package day47_Abstraction;

public class IEDriver extends RemoteWebDriver{
    @Override
    protected void get(String URL) {
        System.out.println("Opening "+URL+" in IE Browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing IE Browser" );
    }
}
