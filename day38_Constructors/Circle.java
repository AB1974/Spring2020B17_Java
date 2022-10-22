package day38_Constructors;

import java.text.DecimalFormat;

/**
 * Create a class called Circle
 * instance variables:
 * radius, pi, diameter
 * add a constructor that can initialize the radius of the circle
 * <p>
 * instance methods:
 * area(): can return the area of the circle as double
 * perimeter(): cna return the perimeter of the circle as double
 * toString(): returns the info of the circle
 * <p>
 * Note: global value of PI is 3.14
 * diameter of circle = 2 * radius
 * area of circle = PI * r * r
 * perimeter:diameter*PI
 */

public class Circle {
    static double PI = 3.14;
    double radius;
    double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double area() {

        return PI * radius * radius;
    }

    public double perimeter() {

        return diameter * PI;
    }

    public String toString() {

        return "Circles radius: " + radius + " Circles diameter: " + diameter + " Circles area: " + area() + " Circles perimeter: " + perimeter();

    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");//decimal formatting
        Circle circle1 = new Circle(5.54);

        System.out.println(circle1);
        System.out.println(df.format(circle1.area()));//decimal formatting
    }

}
