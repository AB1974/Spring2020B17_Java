package OfficeHours.Practice_03_25_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {



        //implicit casting: small primitive can ALWAYS be assigned to larger one so it's done automatically.

        byte bnum = 100;

        short snum=bnum;

        //explicit  casting: larger primitives can  be assigned to smaller one .it must be done manually.

        int iNum =200;

        short sNum =(short)iNum;

        float fNum =(float)0.5;

        float fNum2=(long)0.5;

        long lNum1 =(long)4.5;

        // LONG, INT, SHORT,BYTE==> ONLY ACCEPT WHOLE NUMBER.

        System.out.println(9/2);//4
        System.out.println(9/(float)2);//4.5
        System.out.println((10.0/3));

    }
}
