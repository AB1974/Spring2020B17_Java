package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class staticBlock4 {

    static String name = "Cybertek School";
    static Tester tester1 = new Tester();
    //tester1.setInfo("Aylin",123,"SDET",120000)
    int insVariable;

    static {//DESIGN FOR STATIC ONLY
        //this block gets executed as soon as class is loaded!
        // this block design initialize  static variables

        name = "Cybertek School";//you can initialize in the static block !
        //this static block gets executed first before the main method!
        tester1.setInfo("Aylin", "SDET", 120000, 123);
        tester1.setInfo("Onur", "Tester", 150000, 1293);

        //  insVariable=300;//static is only accepts static does not accept instance variable
        // staticBlock4 obj1 = new staticBlock4();
        //  obj1.insVariable = 300;//DO NOT USE static block initializing instance variable !
        // System.out.println(obj1.insVariable);
    }


    public static void main(String[] args) {

        System.out.println(name);//Cybertek School
        System.out.println(tester1);

        staticBlock4 obj2 = new staticBlock4();
        System.out.println(obj2.insVariable);//0

    }
}
