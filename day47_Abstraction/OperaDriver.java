package day47_Abstraction;

public final class OperaDriver extends RemoteWebDriver  {


    @Override
    protected void get(String URL) {
        System.out.println("Opening "+URL+" in Opera Browser" );
    }

    @Override
    public void quit() {
        System.out.println("Closing Opera Browser");
    }
}
