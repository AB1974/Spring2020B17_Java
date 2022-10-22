package day43_MethodOverriding.Task01;

public class Circle extends Shape {

    /**
     * area,perimeter
     * calculate area(),calculatePerimeter() is already exist
     */
    public double radius;
    public static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;

    }

    public void calculateArea() {//we override the method in shape class
        area = radius * radius * PI;
        System.out.println("Area of the circle: " + area);

    }

    @Override//this method override from shape class
    public void calculatePerimeter() {
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle: " + perimeter);
    }

}
