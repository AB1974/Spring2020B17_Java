package Interview;



public class valueParse {

    public static void main(String[] args) {

        String str = "123";

        Integer num = Integer.parseInt(str);//autoboxing(int i integer a atiyoruz )
        System.out.println(num);
        //Integer.parseInt(str) returns int


        int num1 = Integer.valueOf(str);//

        //Integer.valueOf(str) returns Integer

        System.out.println(num1);


    }
}
