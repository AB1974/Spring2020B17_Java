package day50_polymorphism.Polymorphism.Task2;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {

    public static void main(String[] args) throws Exception {

        Shape[] shapes = {new Triangle(), new Square(), new Circle(),
                new Triangle(), new Square(), new Circle()
        };

        Shape[] shapes2 = new Shape[3];
        shapes[0] = new Triangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();

        shapes[0].draw();
        shapes[1].draw();

        for (Shape each : shapes) {
            each.draw();
        }

        List<Shape> shapesList = new ArrayList<>();    //List is interface ArrayList is object
        ArrayList<Shape> shapesArrayList = new ArrayList<>();
        shapesList.add(new Triangle());
        Shape newShape = new Square();
        shapesList.add(newShape);
        shapesList.add(new Circle());
        shapesList.add(new Circle());
        shapesList.add(new Triangle());

        for (Shape shapeItem : shapesList) {
            System.out.println(shapesArrayList.getClass().getSimpleName().toUpperCase());
            shapeItem.draw();
        }
        for (int i = 0; i < shapesList.size(); i++) {

            System.out.println(shapesList.get(i).getClass().getSimpleName().toUpperCase());
            shapesList.get(i).draw();
        }
    }


}

