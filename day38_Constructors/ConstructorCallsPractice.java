package day38_Constructors;

public class ConstructorCallsPractice {

    public ConstructorCallsPractice() {
        this(10.0);
        System.out.println("A");
    }

    public ConstructorCallsPractice(int a) {
        this();
        // this(10.5);one constructor can not call 2 constructor
        System.out.println("B");
    }

    public ConstructorCallsPractice(double a) {
        // this(); default constructor already calls double constructor
        //this(5.5)//gives an error can not call by itself
        // this(3);//default constructor already calls double constructor
        System.out.println("C");
    }

    public static void main(String[] args) {
        new ConstructorCallsPractice(10);
    }
}
