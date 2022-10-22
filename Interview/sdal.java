package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class sdal {
    //ascending
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(-3, -7, -20, 5));
        for (int i = 0; i < num.size(); i++) {
            for (int j = i + 1; j < num.size(); j++) {
                if (num.get(i) > num.get(j)) {
                    Integer temp = num.get(i);
                    num.set(i, num.get(j));
                    num.set(j, temp);
                }
            }
        }
        System.out.println(num);

        int array[]={4,7,8,1};

        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }


}

