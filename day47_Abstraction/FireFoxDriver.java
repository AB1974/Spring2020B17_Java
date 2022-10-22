package day47_Abstraction;

public final  class FireFoxDriver extends RemoteWebDriver{

    public void get(String URL){
        System.out.println("Opening "+URL+" in FireFox Browser");
    }

    public void quit(){
        System.out.println("Closing Firefox Browser" );
    }
}
