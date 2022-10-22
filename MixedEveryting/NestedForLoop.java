package MixedEveryting;

public class NestedForLoop {
    public static void main(String[] args) {
        //NESTED FOR LOOP
        // row(r), column(k)

        for (int r = 0; r <= 3; r++) {

            for (int k = 3; k >= 0; k--) {
                if (r == k)
                    continue;
                System.out.println(r + "" + k);
            }
        }
        // 0==3, 0==2, 0==1, 0==0(basmiyor)
        // 1==3, 1==2,1==1(basmiyor),1==0,
        //2==3,2==2(basmiyor),2==1,2==0,
        //3==3(basmiyor),3==2,3==1,3==0

    }
}
