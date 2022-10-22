package day40_Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {
        Person person1=new Person("Aylin");
        System.out.println(person1.name);
       // System.out.println(person1.SSN);//private data
        System.out.println(person1.getSSN());
        person1.setSSN(123456);
        System.out.println(person1.getSSN());
        //System.out.println(person1.ID);//PRIVATE DATA
        person1.getID();
        System.out.println( person1.getID());
        person1.setID(345678);
        System.out.println(person1.getID());
    }
}
