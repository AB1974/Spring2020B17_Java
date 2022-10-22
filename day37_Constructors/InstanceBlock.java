package day37_Constructors;

public class InstanceBlock {


    {
        System.out.println("instance block1");

    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        //as soon as we create the OBJECT instance block ges executed

        InstanceBlock obj2 = new InstanceBlock();
    }

    {
        System.out.println("instance block2");

    }

    static {
        System.out.println("static block");//only executes once !
    }

}
