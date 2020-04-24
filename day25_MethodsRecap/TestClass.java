package day25_MethodsRecap;

import Resources.Library;

public class TestClass {

    public static void main(String[] args) {

        String str="ABCABCABCABCDDDDD";
        String result=Library.RemoveDuplicates(str);
        System.out.println(result);


        String a="python,python,python,python";
        String b="python";
        int num1=Library.Frequency(a,b);
        System.out.println(num1);

        String str1="AABBDDEB";
        String str2="B";

        int num=Library.Frequency(str1,str2);

        System.out.println(num);

        String str3="KKKKKKKLLLLLGGGGTTTTT";
        String str5=Library.FrequencyOfChars(str3);
        System.out.println(str5);

    }



}
