package MixedEveryting;

public class swapMethod {
    //How can you swap ?
    public static void main(String[] args) {
        swapMethod ob = new swapMethod();
        ob.swap(1, 5);
    }

    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }
}