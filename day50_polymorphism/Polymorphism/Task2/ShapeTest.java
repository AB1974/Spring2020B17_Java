package day50_polymorphism.Polymorphism.Task2;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Shape shape1 = new Shape();//Polymorphism
        shape1.draw();

        Shape circle = new Circle();//Polymorphism
        circle.draw();

        Shape square = new Square();//Polymorphism
        square.draw();
        Shape triangle = new Triangle();//Polymorphism
        //  Reference TYPe is Parent Class /Interface

        List<String> names = new ArrayList();
        //interface




    }
}
