package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {

    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();
        obj1.getSSN();
        obj1.setSSN(123666);
        System.out.println(obj1.getSSN());
    }

}
