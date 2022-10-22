package day46_final_abstract.Abstraction;

public class Rectangle extends Shape {

    public double with ;
    public double length;

    public Rectangle(double with,double length){
        this.with=with;
        this.length=length;
    }
    @Override
    public void Area(){
        double area=with*length;
        System.out.println("Area of Rectangle is : " +area);
    }
}
