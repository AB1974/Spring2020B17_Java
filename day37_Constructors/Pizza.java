package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    /**
     * 1. create a custom class for pizza that should contain the following:
     * instance variables:
     * size (either small, medium, large)
     * number of cheese topping
     * number of pepperoni toppings
     * Add a constructor that can allow user to set the size and toppings of the pizza
     * instance method:
     * calcCost(): returns the total cost as double
     * toString(): a String return method that's containing the pizza' size,
     * quantity of each topping, and the pizza cost as calculated by calcCost()
     * Pizza cost is determined by:
     * Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
     * Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
     * Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
     * create a class called Order
     * create five objects of the pizza
     * create an arraylist of pizza and add those 5 objects into it
     * calculate the total price of the order (use for each loop)
     */

    String size;
    int numberOfCheeseTopping;
    int numberOfPepperoniTopping;
    double calcCost;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {//constructor//
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

    public double calcCost() {

        if (size.equalsIgnoreCase("small")) {

            calcCost = 10 + (numberOfPepperoniTopping * 1.5) + (numberOfCheeseTopping * 1.0);

        } else if (size.equalsIgnoreCase("medium")) {

           calcCost = 12 + (numberOfPepperoniTopping * 1.5) + (numberOfCheeseTopping * 1.0);

        } else if (size.equalsIgnoreCase("large")) {

           calcCost = 14 + (numberOfPepperoniTopping * 1.5) + (numberOfCheeseTopping * 1.0);

        }
        return calcCost;
    }

    public String toString() {

        return "Size: " + size + " Total Cost: $"+calcCost();
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small", 2, 2);
        Pizza pizza2 = new Pizza("medium", 3, 3);
        Pizza pizza3 = new Pizza("large", 2, 2);
        Pizza pizza4 = new Pizza("small", 3, 3);
        Pizza pizza5 = new Pizza("medium", 2, 2);

        ArrayList<Pizza> pizzaList=new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));
        for(Pizza each:pizzaList) {
            System.out.println(each);
        }
    }

}
