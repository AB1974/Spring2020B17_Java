package day42_Inheritance;

class test {//parent (super) class

    public test() {//parent class constructor is a default constructor
        System.out.println("A");
    }

}

public class Constructor extends test { //sub class

    public Constructor() {//calling default constructor

        System.out.println("B");
    }

    public static void main(String[] args) {
        test obj = new test(); //when we create object  from parent//super  class //prints A
        Constructor obj2 = new Constructor();//from sub class //prints A (super class) B(sub class)//AB
    }
}
