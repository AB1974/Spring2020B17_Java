package day09_NestedIf_Ternary;

public class Moradil_NastedIfStatementSuperSuper {

    public static void main(String[] args) {
        int typeSelection = 2;
        int drinkSelection =1;
        double price =0;
        String drink ="none";

        if(typeSelection==1){
            System.out.println("Hot Drinks:1-Tea 2-Coffee");
            if(drinkSelection==1) {
                price = 2.0;
                drink = "tea";
            }else if(drinkSelection==2) {
                price = 4.0;
                drink = "coffee";

                System.out.println("invalid hot drink selection");}
            }else if(typeSelection==2){
                System.out.println("Cold Drinks:1-Iced Tea 2-Lemonade");
                if(drinkSelection==1) {
                    price = 3.2;
                    drink = "iced tea";
                }else if(drinkSelection==2) {
                    price = 3.5;
                    drink = "lemonade";
                }else{
                    System.out.println("invalid cold drink selection");}

            }else{
                System.out.println("invalid drink type selection");
            }
        if(drink.equals("none")) System.out.println("please try again");

        else System.out.println("your total for "+drink+" is $"+price);
        }
    }

