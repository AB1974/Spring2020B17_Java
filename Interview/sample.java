package Interview;

public class sample {

    public static void main(String[] args) {
        String str = "Hello"; //"Hlo"
        String newstr="";

        for (int i=0;i<str.length();i+=2){
            newstr+=str.charAt(i);
        }

        System.out.println(newstr);

        String str1=new String();
        System.out.println(new String ());
    }
}
