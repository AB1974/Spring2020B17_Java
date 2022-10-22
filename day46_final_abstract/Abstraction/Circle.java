package day46_final_abstract.Abstraction;

public final class Circle extends Shape {//we do not want to inherit  this class we apply final

    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public void Area(){
        double area = radius * radius * PI;
        System.out.println("Area of circle: "+area);
    }

}

