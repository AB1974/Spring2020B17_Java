package day42_Inheritance.Task02;

public class DeviceObjects {

    public static void main(String[] args) {

        TV obj1 = new TV("Samsung", "E250", 500, "40 inches");
        obj1.country = "USA";//we change country
        System.out.println(obj1);

        Phone obj2=new Phone("IPhone","11",1000,"large");
        System.out.println(obj2);
    }
}
