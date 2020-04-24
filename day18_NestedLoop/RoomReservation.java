package day18_NestedLoop;
import java.util.Scanner;
public class RoomReservation {

    public static void main(String[] args) {


    /*

    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */



        Scanner scan = new Scanner(System.in);

        int Price = 0;

        while (true) {
            System.out.println("Which bedroom do you want to reserve? ");
            String answer = scan.nextLine();


            while (!(answer.equalsIgnoreCase("KIng Bed") || answer.equalsIgnoreCase("Queen Bed")
                    || answer.equalsIgnoreCase("Single Bed"))) {

                System.out.println("Please re-enter !");
                answer = scan.nextLine();

            }if(answer.equalsIgnoreCase("King Bed")){
                Price+=120;
            }else if (answer.equalsIgnoreCase("Queen Bed")){
                Price+=100;
            }else if(answer.equalsIgnoreCase("Single Bed")){
                Price+=80;
            }
            System.out.println("Your total price is:"+Price);
            System.out.println("Do you want to reserve another room?");
            answer=scan.nextLine();
            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Please re-enter Yes or No ");
                answer=scan.nextLine();
            }
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Your total price is "+Price);
                break;

            }

        }
    }

}
