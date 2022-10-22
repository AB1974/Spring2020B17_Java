package day48_Abstraction;

interface P {

    void method1();
}

interface Q extends P {

    int method2();
}

abstract class R {

    abstract void method3();
}

public class extends_implements2 extends R implements Q, P {//extends keyword has to come first.

    public static void main(String[] args) {
      //  R obj = new R();//we can not create object from abstract class
      // Q obj1=new Q();//  we can not create object from interface .both of them are not concurate
    }

    @Override
    public int method2() {

        return 0;
    }

    @Override
    void method3() {

    }

    @Override
    public void method1() {

    }

    //we can not create object from abstract class because abstract is not concurate
}
