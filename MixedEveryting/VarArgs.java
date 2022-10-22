package MixedEveryting;


class Calculator {

    public void printAllArrayNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void printAllArrayNumbers2(int...numberss) {

        for (int i = 0; i < numberss.length; i++) {

            System.out.print(numberss[i] + " ");
        }
        System.out.println();
    }
}

public class VarArgs {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        int[] num={2,3,77};
        c.printAllArrayNumbers(num);
        c.printAllArrayNumbers2(1,2,4546,566,6767);


    }
}
