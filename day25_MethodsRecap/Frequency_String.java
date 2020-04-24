package day25_MethodsRecap;

public class Frequency_String {

    public static void main(String[] args) {
        //how many times  str2 occurred  in str1?
        String str1 = "javajavavavavjava";
        String str2 = "java";

        int count = 0;


        while (str1.contains(str2)) {
            count++;
            str1=str1.replaceFirst(str2,"");//after the first execution we remove that one.count rest!
        }
        System.out.println(count);//it will give you total numbers of occurrance!

        String a="python,python,python,python";
        String b="python";
        int num1=Frequency(a,b);
        System.out.println(num1);
    }


    public static int Frequency(String str1,String str2 ){


        int count = 0;


        while (str1.contains(str2)) {
            count++;
            str1=str1.replaceFirst(str2,"");//after the first execution we remove that one.count rest!
        }
        System.out.println(count);//it will give you total numbers of occurrance!
    return count;

    }
}
