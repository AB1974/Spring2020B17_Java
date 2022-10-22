package day47_Abstraction;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        FireFoxDriver driver2=new FireFoxDriver();
        driver2.get("https://firefox.com");
        driver2.quit();

        OperaDriver driver3=new OperaDriver();
        driver3.get("https://www.opera.com");
        driver3.quit();

        IEDriver driver4=new IEDriver();
        driver4.get("https://google.com");
        driver4.quit();
    }
}
