package Repplit_Solutions;
import java.util.*;

/*
using an if statement check which int is larger a or b, and then output:
"number is greater".

for example:
a=1
b=2

output:
2 is greater

 */
public class repplit025 {

    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a>b){
            System.out.println (a + " is greater");
        }
        if (a<b){
            System.out.println (b + " is greater");
        }

    }
}
