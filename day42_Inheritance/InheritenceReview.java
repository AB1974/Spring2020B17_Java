package day42_Inheritance;

class B {
    public B(int a) {
        System.out.println("INT");
    }

    public B(double a) {
        System.out.println("double");
    }

    public B(long a) {
        // this(4.5);
        this(10);
        System.out.println("long");

    }
}

public class InheritenceReview extends B {

    public InheritenceReview(String a) {
        super(109090903l);//double ,long//super ()can be used in sub class only
        System.out.println("String");//string
    }

    public static void main(String[] args) {
        InheritenceReview obj = new InheritenceReview("Hi");
    }
}
