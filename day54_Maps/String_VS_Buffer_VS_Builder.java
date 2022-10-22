package day54_Maps;

public class String_VS_Buffer_VS_Builder {
    public static void main(String[] args) {
        String str1 = "cybertek";//String immutable
        System.out.println(str1.concat("School"));//Cybertek School

        System.out.println(str1);//Cybertek

        System.out.println("===============================");

        StringBuilder builder = new StringBuilder("Cybertek");//It's mutable we modified
        builder.append("School");
        System.out.println(builder);//CybertekSchool
//it not syncronized its faster
        System.out.println("=================");

        StringBuffer buffer=new StringBuffer("Cybertek");
        buffer.append("School");
        System.out.println(buffer);//all the methods are syncronized and slow threa safe

        String word="ABCD";

        StringBuilder sBUILDER=new StringBuilder(word);
        System.out.println(sBUILDER.reverse());


    }
}
