package Interview;

public class AccessModifiers {
    protected int a = 100;

    public String toString(){
        return "int : "+a;
    }

}

class Test {
    public static void main(String[] args) {
        AccessModifiers obj1=new AccessModifiers();
        System.out.println(obj1);

    }


}