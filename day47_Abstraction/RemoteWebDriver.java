package day47_Abstraction;

public abstract class RemoteWebDriver {

    //IN ORDER TO GET THIS INSTANCE METHOD YOU HAVE TO CREATE AN OBJECT!
    //IN DRIVER OBJECTS
    protected abstract void get(String URL);

    public abstract void quit();

}

