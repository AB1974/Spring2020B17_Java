package Interview;

public class SumOfDigitsInAString_06 {

    public static void main(String[] args) {

        String s = "123456";
        String s1[] = s.split("");
        int sum = 0;
        for (String each : s1) {
            sum += Integer.parseInt(each);
        }
        System.out.println(sum);
    }

}
