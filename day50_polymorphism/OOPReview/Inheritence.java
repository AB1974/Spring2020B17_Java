package day50_polymorphism.OOPReview;


public class Inheritence {

    public static int publicInt = 100;

    protected int protectedInt = 200;

    int defaultInt = 300;

    private int privateInt = 400;

}


class Data extends Inheritence {
    public static void main(String[] args) {

        Data obj = new Data();
        System.out.println(obj.publicInt);
        System.out.println(obj.protectedInt);
        System.out.println(obj.defaultInt);//if inside the same package
        //System.out.println(obj.privateInt);//can never be inherit


        //advantage
        //easy to maintain
        //reusable

    }

}