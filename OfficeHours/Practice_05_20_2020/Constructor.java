package OfficeHours.Practice_05_20_2020;


class Test {

    public Test(int a){
        System.out.println("a");

    }
}
public class Constructor extends Test{

    public Constructor(){
        super(10);
        System.out.println("b");
    }

    public static void main(String[] args) {

        Constructor obj=new Constructor();
    }

}
