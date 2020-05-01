package day00_StudyAtHome;

import java.util.Arrays;

public class replitmerge2Array {

        public static int[] mergR(int[] a,int[] b) {
            int[] merge = new int[a.length + b.length];
            int z = 0;
            for (int i = 0; i < a.length; i++) {
                merge[z] = a[i];
                z++;
            }
            for (int j = 0; j < b.length; j++) {
                merge[z] = b[j];
                z++;
            }
            return merge;





    }

    public static void main(String[] args) {


    }
}