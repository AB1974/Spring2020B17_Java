package day06_Shorthand_LogicalOp;

public class GallonToLiter {
    public static void main(String[] args) {

        double numberOfGallons =5 ;
        double gallonsToLiters=numberOfGallons*3.875;

        String result = numberOfGallons + " gallons is equal to : "+gallonsToLiters+ " litters";

        System.out.println(result);

    //===============================================
        double numberOfLiters=100;
        double litersToGallons=numberOfLiters/3.875;
        String result1 =numberOfLiters+" liters is equal to :" +litersToGallons+" gallons";

        System.out.println(result1);


    }

    /*

    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785



    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

     */
}
