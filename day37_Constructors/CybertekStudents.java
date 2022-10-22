package day37_Constructors;

public class CybertekStudents {

    static String schoolName="Cybertek School";//if the variable is static we should assign outside of constructor !
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName,int groupNumber,String batch) {

        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;

    }

    public String toString(){

        return "Name: "+studentName+", Batch: "+batch+" , in group: "+groupNumber+", School name: "+schoolName;
    }

}

class Test{

    public static void main(String[] args) {
        CybertekStudents student1=new CybertekStudents("Aylin Bekem",2,"Batch 18");

        student1.schoolName="Harvard";

        System.out.println(student1);

        CybertekStudents student2=new CybertekStudents("Arzu Ozen",4,"Batch18");
        System.out.println(student2);

    }

}