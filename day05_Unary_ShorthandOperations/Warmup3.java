package day05_Unary_ShorthandOperations;

public class Warmup3 {

        public static void main(String[] args) {
            int number = 80;
            boolean divisible5 = number % 5 == 0;
            boolean divisible3 = number % 3 == 0;
            boolean divisible2 = number % 2 == 0;
            String result5 = number + "is divisible by 5: " + divisible5;
            String result3 = number + "is divisible by 3: " + divisible3;
            String result2 = number + "is divisible by 2: " + divisible2;
            System.out.println(number + "is divisible by 5:" + divisible5);
            System.out.println(number + "is divisible by 3:" + divisible3);
            System.out.println(number + "is divisible by 2:" + divisible2);
            String finalresult = result2 + "\n" + result3 + "\n" + result5;
            System.out.println(result5);
            System.out.println(result3);
            System.out.println(result2);
            System.out.println(finalresult);



        }
    }

