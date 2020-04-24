package day19_Arrays;
import java.util.Arrays;
public class MoradilArray {

    public static void main(String[] args) {



        int[] number =new int[3];

        System.out.println(Arrays.toString(number));//0,0,0

        number[0]=3;
        number[1]=4;
        number[2]=4;
        System.out.println(Arrays.toString(number));
        System.out.println((number[0]));

        int []numbers={2,4,6,};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        number[2]=number[2]+4;
        number[2]++;
        System.out.println(number[2]);//you can do that //

        int []population=new int[5];
        population[0]=5000;
        population[1]=7000;
        population[2]=1350;
        population[4]=6000;
        population[3]=1780;


        System.out.println(Arrays.toString(population));
        int idx=0;

        String str="abc";
        System.out.println(population[str.length()]);



    }
}
