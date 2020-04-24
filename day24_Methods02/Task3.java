package day24_Methods02;

public class Task3 {


    public static String c_profits(int buyPrice, int sellPrice) {
        //your code here



        String str =(buyPrice<sellPrice)? "profit":(buyPrice>sellPrice)?"loss":"no loss";


        return  (str);

}
    public static void main(String[]args){
        String str1= c_profits(10,20);
        System.out.println(str1);
        sayHello();
        code();
        Boolean bool1=isEven(7);
        System.out.println(bool1);
    }


    public static void sayHello(){

        System.out.println("Hello friends");
        System.out.println("How are you today?");
    }

    public static void code(){
        System.out.println("Students are coding Java");


    }
    public static boolean isEven(int n){



        Boolean bool1=(n%2==0)? true :false;

        return bool1;

    }
}