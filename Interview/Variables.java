package Interview;

public class Variables {

    private int a = 100;//instance
    static int b = 20;//static

    void method() {
        int c = 50;//local
    }

    public static void main(String[] args) {
        Variables obj1 = new Variables();
        System.out.println(obj1.a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}