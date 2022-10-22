package day43_MethodOverriding.Task01;

/**
 * Task:
 * 1. create a class called ShapeActions:
 * methods: calculateArea(), calculatePerimeter()
 * 2. create sub classes of Shape:
 * Circle
 * Rectangle
 * square
 * give the instance variables that are needed to calculate the Area, perimeter, of those shapes
 */
public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);


        circle1.calculateArea();    // area suppose to be: PI * r * r
        circle1.calculatePerimeter(); // perimeter suppose to be PI * r * 2

        System.out.println("=========================================");

        Rectangle rec1 = new Rectangle(3, 2);

        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.calculateArea();   // area suppose to be: w *l
        rec1.calculatePerimeter(); // perimeter (w+l)*2

        System.out.println("=========================================");

        Square sq1 = new Square(4);

        System.out.println(sq1.side);

        sq1.calculateArea();  // area  suppose to be: side * side
        sq1.calculatePerimeter(); // bug perimeter (side*4)
    }
}