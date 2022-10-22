package day46_final_abstract.Abstraction;

public class Square extends Shape {
    public double side;

    Square(double side) {
        this.side = side;
    }

    public void Area() {

        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
