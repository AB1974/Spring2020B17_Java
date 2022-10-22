package Interview;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        if (str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString().equals(str);
    }

 public static boolean isPalindrome2(String s){

        int head=0;
        int tail=s.length()-1;
        while(head<tail){
            if(s.charAt(head)!=s.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
 }

    public static void main(String[] args) {

        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome2("level"));
    }


}

