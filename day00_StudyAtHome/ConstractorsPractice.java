package day00_StudyAtHome;

public class ConstractorsPractice {

    ConstractorsPractice(int a) {

        System.out.println("HI I'm constructor with parameter of int 4");
    }

    public static void main(String[] args) {


        ConstractorsPractice obj = new ConstractorsPractice(6);//default


    }

    public static void method1() {

        System.out.println("custom method method1");

    }

    public static void method2(){
        ConstractorsPractice obj2 = new ConstractorsPractice(6);//default
method1();
    }


}
