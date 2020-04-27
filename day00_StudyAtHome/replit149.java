package day00_StudyAtHome;
import java.util.*;
public class replit149 {


        public static void add_to_r(int[] r,int n) {
            //create new array with one more position.
            int [] r2= new int[r.length+1];
            for (int i=0; i<r.length; i++){
                r2 [i]=r[i];
            }
            r2[r2.length-1]=n;
            System.out.println(Arrays.toString(r2));
        }

        public static void main(String[] args) {


            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt(),n = inp.nextInt();
            int[] arr = new int[size];
            for(int i=0 ;i<=size-1;i++)
            {

                arr[i]=inp.nextInt();
            }

            add_to_r(arr, n);


        }
    }