package day33_CustomClass;

public class warmUpTaskPizza {
    /**
     * 1. create a custom class for pizza that should contain the following:
     * instance variables:
     * size (either small, medium, large)
     * number of cheese topping
     * number of pepperoni toppings
     * instance method:
     * customizeOrder(): allows user to set the size and toppings of the pizza
     * calcCost(): returns the total cost as double
     * toString(): a String return method that's containing the pizza' size,
     * quantity of each topping, and the pizza cost as calculated by calcCost()
     * Pizza cost is determined by:
     * Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
     * Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
     * Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
     */
    String size;
    int numberOfCheese;
    int numberOfPepperoni;
    double cost;

    public void customizeOrder(String sizing, int cheese, int pepperoni){
        size = sizing;
        numberOfCheese = cheese;
        numberOfPepperoni = pepperoni;
    }
    public double calculateCost(){
        if(size.equals("small")){
            return    cost = 10 + (numberOfPepperoni * 1.50) + (numberOfCheese * 1);
        }else if(size.equals("medium")){
            return    cost = 12 + (numberOfPepperoni * 1.5) + (numberOfCheese * 1);
        }else if(size.equals("large")){
            return    cost = 15 + (numberOfPepperoni * 1.5) + (numberOfCheese * 1);
        }else{
            return 0;
        }
    }
    public String toString(){
        String result  = "I want " + size + " pizza "+"with " + numberOfCheese +
                " cheese toppings and " + numberOfPepperoni + " pepperoni toppings "
                + "and price is $ " + calculateCost() ;
        return result;
    }
}