package day50_polymorphism.Polymorphism.Apple;

public class AppleStore {

    public static void main(String[] args) {
        AppleDevice mac = new Mac();//Reference Type Decides
        mac.use();
        //mac.code does not work! because there is no code method in AppleDevice

        Mac mac1 = new Mac();
        mac.use();
        mac1.code();
        AppleDevice watch = new AppleWatch();
        watch.use();
      //  watch.wear();//is not compile because wear method is not in AppleDevide


    }
}
