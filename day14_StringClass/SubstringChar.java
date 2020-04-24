package day14_StringClass;

public class SubstringChar {
    public static void main(String[] args) {

        String word = "excellent";


        System.out.println(word.substring(0,1)); //ILK HARFI BASMAK ICIN 0 ILK HARF ,1 ISE 2. HARF (AMA EXCLUDE OLUR ALWAYS)

        System.out.println(word.substring(word.length()-1,word.length()));
                //                          8               9

        System.out.println(word.lastIndexOf("l"));
        System.out.println(word.substring(5));

        String str = "Java is good";
        System.out.println(str.indexOf(" "));
        System.out.println(str.substring(0,4));
        System.out.println(str.lastIndexOf(" "));
        System.out.println(str.substring(8));

        String str1  = "Nur is beautiful";

        str1.substring(0,1);
        str1.substring(str1.length()-1,str1.length());

        str1.charAt(0);
        str1.charAt(str1.length()-1);

        str1.contains("is");
        System.out.println( str1.contains("is"));

    }
}
