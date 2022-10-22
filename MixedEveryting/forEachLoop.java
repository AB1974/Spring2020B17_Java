package MixedEveryting;

public class forEachLoop {

    public static void main(String[] args) {
        int[] rows = {1, 2, 3, 4};
        int[] colm = {1, 2, 3};

        for(int row:rows){
            System.out.println();
            for(int col :colm){
                System.out.print("IRow"+row+"-Column"+col);

            }
        }


        for (int r=0;r<rows.length;r++){
            System.out.println();
            for (int c=0;c<colm.length;c++){
                System.out.print(" IRow "+r+"-Column"+c);
            }
        }




    }
}
