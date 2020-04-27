package day29_Wrapper_ArrayList;

public class ParseMethods {

    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str);//123(int)

        System.out.println(str);//123(String-text)
        System.out.println(a1);//123(int-number)

        System.out.println(str + 1);//1231(String-text)
        System.out.println(a1 + 1);//124(int-number)

        byte b1 = Byte.parseByte(str);//Byte is wrapper class! //byte is primitive(number)
        System.out.println(b1);//123 (byte-number)

        Integer I1 = (int) Byte.parseByte(str);//autoboxing

        String str2 = "12.5";
        float f1 = Float.parseFloat(str2); // float 10.5
        System.out.println(str2 + 1);//10.51
        System.out.println(f1 + 1);//11.5

        double d1 = Double.parseDouble(str2);//double 10.5
        System.out.println(d1 + 1);

        System.out.println(f1); //float

        String str3 = "2147483647";//max value int can have // data type is string

        String str4 = "3147483647";//we need to convert to Long.

        long l1 = Long.parseLong(str4);

        System.out.println(l1); //data type is long
        //int num1=Long.parseLong(str4);//number is too large does not compile

        System.out.println(l1 + 2);

        Long num2 = Long.parseLong(str4);//we assign primitive to wrapper class autoboxing
        System.out.println(num2);

        String result1 = "true"; //"Today is Monday" if does not match boolean it will return you false!

        boolean r1 = Boolean.parseBoolean(result1);
        System.out.println(!r1);//false

        String result2="false";// it's not case sensitive.

        boolean r2=Boolean.parseBoolean(result2);
        System.out.println(r2);//it returns primitive values
    }
}
