package Interview;

interface data {
    abstract void print();//line 1
}

class Testtt implements data {

    @Override
    public void print() {//line 2//access modifier has to be more visible
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        data obj = new Testtt();//line 3
        obj.print();
    }
}

