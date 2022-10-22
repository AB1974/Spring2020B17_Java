package day46_final_abstract.Abstraction;

import org.w3c.dom.css.Rect;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle obj = new Circle(3.5);
        obj.Area();

        Square obj1 = new Square(4.0);
        obj1.Area();

        Rectangle obj2 = new Rectangle(3.0, 3.5);
        obj2.Area();
    }
}
