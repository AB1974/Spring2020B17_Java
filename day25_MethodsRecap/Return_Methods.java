package day25_MethodsRecap;

public class Return_Methods {

    public static void main(String[] args) {
        int num = MaxNum(10, 9);
        System.out.println(num);
        //or
        System.out.println(MaxNum(10,9));//we can not use second time if we do not assign another int variable .
        int num2=maxNum2(10,9);
        System.out.println(num2);
    }

    public static int MaxNum(int a, int b) {
        int maxNum = 0;

        if (a >= b) {
            maxNum = a;
        } else {
            maxNum = b;
        }

        return maxNum;

    }

    public static int maxNum2(int a, int b) {//this way is shorter //

        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }


}
