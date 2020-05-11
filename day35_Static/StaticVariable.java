package day35_Static;


public class StaticVariable {
    String name1;
    static String name;

    public static void main(String[] args) {

        StaticVariable obj1 = new StaticVariable();
        obj1.name1 = "Aylin";
        System.out.println(obj1.name1);

        StaticVariable obj2 = new StaticVariable();
        obj2.name1 = "Engin";
        name = "Arin";
        System.out.println(name);
    }
}
