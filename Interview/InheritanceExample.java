package Interview;


class Teacher {//inheritance example
    String designation = "Teacher";
    String college = "Beginnersbook";

    void does() {
        System.out.println("Teaching");
    }
}

public class InheritanceExample extends Teacher {
    String mainSubject = "Maths";



    public static void main(String args[]) {
        InheritanceExample obj = new InheritanceExample();

        System.out.println(obj.college);

        System.out.println(obj.designation);

        System.out.println(obj.mainSubject);
        obj.does();
    }
}


