package day24_Methods02;

public class CalcTest {
//Return Method//two ways return the value one is result the other one print out .
    public static void main(String[] args) {
        System.out.println(ReturnPractice.Add(4,5));
        System.out.println(ReturnPractice.multiply(4,5));
        System.out.println(ReturnPractice.divide(6,2));
        System.out.println(ReturnPractice.minus(8,4));


        int result=ReturnPractice.Add(31,56);
        double mResult=ReturnPractice.multiply(80,3);
        double miResult=ReturnPractice.minus(70,6);
        double dResult=ReturnPractice.divide(455,5);

        System.out.println("Result in addition: "+result);
        System.out.println("Result in multiplication: "+mResult);
        System.out.println("Result in subtraction: "+miResult);
        System.out.println("Result in division: "+dResult);

        double a=10.0,b=20.0;
        double myResult=ReturnPractice.minus(a,b);
        System.out.println(myResult);

        double [] dNums ={2.0,4.0};
        double result2=ReturnPractice.multiply(dNums[0],dNums[1]);
        System.out.println("Array result2 is :"+result2);

        if(ReturnPractice.Add(10,16)==26){
            System.out.println("unit test passed");
        }else{
            System.out.println("unit test failed");
        }
    }
}
