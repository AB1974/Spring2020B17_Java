package day25_MethodsRecap;
import java.util.*;
//VERY GOOD example with RETURN  METHOD////
public class Driver_SwitchStatement {
    /*
    Warm up tasks:
    1. write a return method named getDriver1 that accepts a string parameter called Browser
                if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"},
                then it returns the name of that specific browser' driver
                    Ex: getDriver("chrome");  ==> "Chrome Driver"
                        getDriver("fireFOX"); ==> "FireFox Driver"

                if the browser name does not match with any of browsers above, the method should return "Invalid"
                APPLY SWITCH STATEMENTS
    2. do the first task with multi-branch if statement instead of switch statement
    3. do the first task with ternaries instead of switch statements

     */
                //=============SWITCH STATEMENT================//
            public       static String     getDriver1(String browserName){
    //access modifier,specifier,return type,methodName(parameter)

                String result="";

              switch(browserName.toLowerCase().replace(" ","")){

                  case "chrome":
                      result = "Chrome Driver";
                      break;
                  case "firefox":
                      result = "Firefox Driver";
                      break;
                  case "safari":
                      result = "Safari Driver";
                      break;
                  case "opera":
                      result = "Opera Driver";
                      break;
                  case "edge":
                      result = "Edge Driver";
                      break;
                  default:
                      result="Invalid Driver";
              }

                return result;
    }

    //=============IF STATEMENT================//
    public static String getDriver2(String browserName){
                browserName=browserName.toLowerCase();//to ignore case sensivity
                String result="";

                if(browserName.equals("chrome")) {

                    result = "Chrome Driver";
                }else if(browserName.equals("firefox")){
                    result="Firefox Driver";
                }else if(browserName.equals("Safari")){
                    result="Safari Driver";
                } else if (browserName.equals("Edge")) {
                    result="Edge Driver";
                }else if (browserName.equals("Opera")){
                    result="Opera Driver";
                }else{
                    result="Invalid Driver";
                }

                return result;

    }

    //=============TERNARY  STATEMENT================//
 public static String getDriver3(String browserName){
                browserName=browserName.toLowerCase();
                String result=(browserName.equals("chrome"))?"Chrome Driver"
                        :(browserName.equals("firefox"))?"Firefox Driver"
                        :(browserName.equals("edge"))?"Edge Driver"
                        :(browserName.equals("opera"))?"Opera Driver"
                        :"Invalid Driver";


             return result;
 }

            public static void main(String[] args) {
             String str =getDriver1("fire fox");//argument is mandatory.Since method is return we assigned to another string
                System.out.println(str);
                String str2=getDriver2("Chrome");//In return method do not forget to assign!
                System.out.println(str2);
                String str3=getDriver3("Opera");//In return method do not forget to assign!
                System.out.println(str3);

    }

}
