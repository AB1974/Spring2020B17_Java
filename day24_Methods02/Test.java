package day24_Methods02;

import Resources.Library;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "Aylin";

        String RevStr=Library.Reverse(str);
        System.out.println(RevStr);



        int arr[]={5,6,7,8,9,100,-5};

        int []Do=Library.sortDesending(arr);
        System.out.println(Arrays.toString(Do));



    }


}
