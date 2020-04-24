package day00_StudyAtHome;

public class ReturnMethod {


    public static void main(String[] args) {
        System.out.println(giveMe10$());
        int i = giveMe10$();
        System.out.println(i+"");
        String n1=name();
        System.out.println(n1);

    }

    /*this method returns int value*/
    public static int giveMe10$() {

        return 10;


    }


    public static String name(){

        return "Aylin";

    }
}
