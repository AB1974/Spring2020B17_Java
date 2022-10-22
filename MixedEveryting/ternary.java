package MixedEveryting;

public class ternary {

    public static void main(String[] args) {
        int bill=1400;
        int quantity=11;
        int discount=(bill>1000)?(quantity>=11)?10:9:5;
        System.out.println(discount);
    }
}
