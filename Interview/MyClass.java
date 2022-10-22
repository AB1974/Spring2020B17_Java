package Interview;

public class MyClass {
    String name;
    int age;
    MyClass(){
        this("Beginnersbook.com");
        System.out.println("default const");
    }
    MyClass(String s){
        this(s,6);
        System.out.println("constructor with string ");

    }
    MyClass(String s,int age){
        this.name=s;
        this.age=age;
        System.out.println("Constructor with string +int ");

    }

    public static void main(String[] args) {
        MyClass obj= new MyClass();

    }
}
