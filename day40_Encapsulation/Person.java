package day40_Encapsulation;

public class Person {

    public String name;

    private long SSN;
    private int ID;

    public Person(String name) {
        this.name = name;
    }

    public long getSSN() {//GETTER

        return SSN;
    }

    public void setSSN(long SSN) {//SETTER
        this.SSN = SSN;
    }

    public long getID(){ return ID;}


    public void setID(int ID){  this.ID=ID;}

   /** public void setSSNAndID(long SSN,int ID){
        setSSN(SSN);
        setID(ID);

    }
    *///
public String toString(){
    return name+SSN+ID;
}
}
