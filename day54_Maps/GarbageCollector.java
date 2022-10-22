package day54_Maps;

public class GarbageCollector {
    public static void main(String[] args) {

        GarbageCollector obj = new GarbageCollector();//an object /will not be collected by garbage collector
        new GarbageCollector();//garbage collector will be collected

        obj = null;

        System.out.println("Done");

        //un reference an object;

        String str = new String("Cybertek");//will be eligible for garbage collector
        str = new String("MIT");
        System.out.println(str);

        Integer num = new Integer(123);//eligible for garbage collector
        num = new Integer(124);

        Double n = new Double(5);//eligible for garbage collector
        n = null;
        System.out.println(n);

        GarbageCollector obj3 = new GarbageCollector();
        //a method that's called by GC  before the object gets called by Garbage Collector
        // obj3.finalize();its call by compiler automatically
       // System.gc(); You can put it in the teardown you can recommended to Java but not forcefully do it.



    }
}
