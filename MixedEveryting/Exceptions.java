package MixedEveryting;

public class Exceptions {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException();//we manually throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic");//it should come first child class
        } catch (RuntimeException e) {
            System.out.println("Runtime");//this should come later cause parent class
        }
    }

}

