package day10_Switch_Scanner;

public class switchStatement {
    public static void main(String[] args) {

        switch(4){

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("Two");
                break;

            //if none of the case are matching
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");

            default:
                System.out.println("Invalid case");
                break;


        }
    }
}
