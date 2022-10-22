package OfficeHours.Practice_05_13_2020;

public class Instances {

    String name;//instance block
    {
        name="Aylin";
    }

    public void printName() {//instance method

        System.out.println("Name is : "+this.name);

    }

    public static void main(String[] args) {
        Instances obj=new Instances();
        obj.name="Aylin";
        System.out.println(obj.name);
    }

}
