package day50_polymorphism.Polymorphism.DownCasting;

class a {
    public void methoda() {
        System.out.println("methoda");
    }

}

class b extends a {
    public void methodb() {
        System.out.println("methodb");
    }
}

class c extends b {
    public void methodc() {
        System.out.println("methodc");
    }
}

class deneme {
    public static void main(String[] args) {
        a obj = new c();
        obj.methoda();
        System.out.println("====DOWNCASTING==========");
        //casting to call method b
        b obj2 = (b) obj;//downcasting
        obj2.methoda();
        obj2.methodb();
        System.out.println("===DOWNCASTING===========");
        //   casting to call method c
        c obj3 = (c) obj;
        obj3.methoda();
        obj3.methodb();
        obj3.methodc();




    }
}