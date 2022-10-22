package day50_polymorphism.Polymorphism.Task2;

public class InstanceOfOperator {
    public static void main(String[] args) {
        Shape shape = new Square();

        System.out.println(shape.getClass().getName());
        System.out.println(shape.getClass().getSimpleName());

        if (shape.getClass().getSimpleName().equals("Triangle")) {
            System.out.println("It's a Triangle!");
        } else if (shape.getClass().getSimpleName().equals("Circle")) {
            System.out.println("It's a Circle");

        } else if (shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It' s a Square");
        }

        System.out.println(shape instanceof Square);
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Triangle);
        System.out.println(shape instanceof Shape);
        System.out.println(shape instanceof Object);

        if(shape instanceof Triangle){
            System.out.println("It's a Triangle!");
            shape.draw();
        }else if(shape instanceof Circle){
            System.out.println("It's a Circle!");
            shape.draw();
        }else if (shape instanceof Square){
            System.out.println("It's a Square!");
            shape.draw();
        }

    }
}
