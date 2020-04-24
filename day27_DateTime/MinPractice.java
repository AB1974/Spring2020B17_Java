package day27_DateTime;

public class MinPractice {

    public static void main(String[] args) {

        int[] array = {30, 5, 4, -1, 60, -900};

        int min = array[0];


        for (int each : array) {

            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);
        int[] arr2 = {4, 5, 6};
        int num = Minumum(arr2);
        System.out.println(num);
        System.out.println("===");
        double[] arr5 = {9000.0, 65.0, 40.0, -20.0};
        Double num2=Maximum(arr5);
        System.out.println(num2);
    }

    public static int Minumum(int[] arr) {

        int min = arr[0];


        for (int each : arr) {

            if (each < min) {
                min = each;
            }
        }
        return min;
    }


    public static double Maximum(double[] arr2) {

        double Max = arr2[0];

        for (double each : arr2) {
            if (each > Max) {
                Max = each;

            }

        }
        return Max;
    }
}




