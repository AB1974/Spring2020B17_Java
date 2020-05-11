package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {


    //belows ones are static variable in order to run them we need to open
    // static block see in below
    //in order to reach Developer information we use static

    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

    /*
    public static void main(String[] args) {
        dev1.setInfo("Aylin","Developer",120000,1234);

    }
*/
//static blocks help us to reach the data quickly.because it will run before main method gets executed
    //you can run from outside of the class Capital One Class
    static {//static is loaded once this class is loaded !

        dev1.setInfo("Aylin", "Developer", 120000, 1234);

    }

}
