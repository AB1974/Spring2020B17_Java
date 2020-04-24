package OfficeHours.Practice_03_11_2020;

import com.sun.tools.classfile.ConstantPool;

public class Practice_Variables {
    public static void main(String[] args) {
        String brand="BMW";
        short year= 2020;
        float price=50000.50F;
        String model="X6";
        short maximumMiles=32767;

        System.out.println("The vehicle "+year +" "+ brand+" "+ model+ " has "+maximumMiles+" "+" miles,price is"+" "+price+"USD.");

        /*
        brand
        year
        price
        model
        max miles
        The Vehicle 2020 BWW X6 has 32767 miles,price is 50000.05 dollars
         */

    }
}
