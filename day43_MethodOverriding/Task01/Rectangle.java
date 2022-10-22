package day43_MethodOverriding.Task01;

/*
   inherited:
           area, perimeter
           calculateArea(), calculatePerimeter()
    */
public class Rectangle extends Shape {


    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    @Override ///if this annotation is yellow applicable means the method is overridden method if it does not compile means not
    //access modifier has to be same or more visible !
    public void calculateArea() {
        area = length * width;
        System.out.println("Area of the Rectangle: " + area);
    }

    @Override//we override calculateArea method from shape class
    public void calculatePerimeter() {
        perimeter = (width + length) * 2;
        System.out.println("Perimeter of the Rectangle: " + perimeter);
    }
}