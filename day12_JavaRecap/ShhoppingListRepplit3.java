package day12_JavaRecap;
import java.util.Scanner;
public class ShhoppingListRepplit3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1= scan.nextLine();
        int count1= scan.nextInt();
        scan.nextLine();
        double price1= scan.nextDouble();
        scan.nextLine();


        System.out.println("Enter Item2, count and its price:");
        String item2= scan.nextLine();
        int count2= scan.nextInt();
        scan.nextLine();
        double price2= scan.nextDouble();
        scan.nextLine();


        System.out.println("Enter Item3, count and its price:");
        String item3= scan.nextLine();
        int count3= scan.nextInt();
        scan.nextLine();
        double price3= scan.nextDouble();
        scan.nextLine();

        double totalPrice= price1*count1+price2*count2+price3*count3;
        String report= "";

        if(count1>0){
            report+= "Item1: "+item1+ " Price: "+price1*count1;
        }
        if(count2>0){
            report+= ", Item2: "+item2+ " Price: "+price2*count2;
        }
        if(count3>0){
            report+= ", Item3: "+item3+ " Price: "+price3*count3;
        }

        System.out.println(report+"\nTotal price: "+totalPrice);
    }
}
