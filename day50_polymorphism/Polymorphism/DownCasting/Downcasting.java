package day50_polymorphism.Polymorphism.DownCasting;

import day50_polymorphism.Polymorphism.Apple.AppleDevice;
import day50_polymorphism.Polymorphism.Apple.AppleWatch;
import day50_polymorphism.Polymorphism.Apple.Ipad;

public class Downcasting {

    public static void main(String[] args) {

      //  AppleDevice> Ipad
                    //AppleWatch
        AppleDevice appDev = new Ipad();
        appDev.use();
        System.out.println("====downcasting===Let's call draw () method from Ipad Class");

        Ipad ipad=(Ipad)appDev;//DOWNCASTING
        ipad.use();
        ipad.draw();

        AppleDevice obj=new Ipad();
      //  AppleWatch awatch=(AppleWatch)obj; they are both siblings





    }
}
