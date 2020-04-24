package day24_Methods02;

public class StringReverse {


    public static void main(String[] args) {
        // String t = Reverse("Cybertek");

        String name =  Reverse2("Cybertek");

        System.out.println(name);

    }


    public static void Reverse(String str){  // ABCD
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
        System.out.println(Reverse);
    }


    public static String Reverse2(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }





}