package day16_ForLoop2;

public class ContinueStatement {

    public static void main(String[] args) {

        for(int i=1; i<=5;i++){//i1,2,3,4,5

            if(i==3){
                continue;//ignore iteration statement
            }

            System.out.println(i);
        }

        for(int i=0;i<=20;i++){

            if( i%2 !=0){
                continue;//skips all odd numbers
            }
            /*if(i%2==0){
                continue;//skips all even numbers
            }
*/
            System.out.print(i+" ");
        }



    }
}
