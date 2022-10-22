package day40_Encapsulation;

public class Encapsulation {

    private long SSN = 12345;

    //getter ready only
    public long getSSN() {//it has to be public

        return SSN;
    }
    //setter write only

    public void setSSN(long SSN) {//it has to be public

        this.SSN = SSN;
    }

}
