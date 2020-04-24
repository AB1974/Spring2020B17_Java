package Resources;
import java.util.*;
public class Aylins_Library {

    //"================FACTORIAL NUMBER FORMULA============"

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long num=1;

        for ( int i=1;i<=n;i++){

            num=num*i;
        }

        System.out.println(num);

    }
}
