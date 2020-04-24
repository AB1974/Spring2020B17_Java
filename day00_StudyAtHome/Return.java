package day00_StudyAtHome;

public class Return {

    public static void add(String ing){

        System.out.println("Add"+ing);
    }

    public static void mix(int seconds){
        System.out.println("Mix for "+seconds+" seconds");
    }

    public static void fry(int minute){
        System.out.println("fry for "+minute+" minutes");
    }

    public static void boil(int minutes){

        System.out.println("boil it for "+minutes+" minutes");
    }
    public static void main(String[] args) {

        add(" water,eggs,sugar,flour");
        mix(120);
        fry(3);
        boil(30);
    }
}
