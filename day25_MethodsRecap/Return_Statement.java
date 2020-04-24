package day25_MethodsRecap;

public class Return_Statement {

    public static void main(String[] args) {
/*
        if (10 > (9)) {
            return;//exits the current method only !
        }
        System.out.println("hello");//this is not printed!
 */
        String str2=getDriver2("Chrome");
        System.out.println(str2);
        method1();
        System.out.println("Hello");
        method2();
        System.out.println("Hello");

    }

    public static void method1() {

        if (10 > 9) {

            return;//this one for exiting the method1 only !.
        }
    }

    public static void method2() {
        if (10 > 9) {

            System.exit(0);//this one shut down entire program

            System.out.println("Hello World");

        }


    }
    public static String getDriver2(String browserName){
        browserName=browserName.toLowerCase();//to ignore case sensivity


        if(browserName.equals("chrome")) {

            return "Chrome Driver";//this method exist the method.
        }else if(browserName.equals("firefox")){
            return "Firefox Driver";
        }else if(browserName.equals("Safari")){
            return "Safari Driver";
        } else if (browserName.equals("Edge")) {
            return "Edge Driver";
        }else if (browserName.equals("Opera")){
            return "Opera Driver";
        }else{
            return"Invalid Driver";
        }



    }
}
