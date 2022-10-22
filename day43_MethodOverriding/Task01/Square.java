package day43_MethodOverriding.Task01;

public class Square extends Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override////we override the method in shape class
    ////if this annotation is yellow applicable means the method is overridden method if it does not compile means not
    public void calculateArea() {
        area = side * side;
        System.out.println("Area of the square: " + area);


    }

    @Override//we override the method in shape class
    public void calculatePerimeter() {
        perimeter = side * 4;
        System.out.println("Perimeter of the square: " + perimeter);


    }

}
