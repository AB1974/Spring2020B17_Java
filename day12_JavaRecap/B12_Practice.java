package day12_JavaRecap;

public class B12_Practice {
    public static void main(String[] args) {


        int x=0, y=0;

        switch (x+1) {

            case 0: y=0;
            case 1: y=1;
            default:y=-1;
            }
        System.out.println(y);

        int i =1, j=0;

        switch(i){
            case 2:
                j+=6;
            case 4:
                j+=1;
            default:
                j+=2;
            case 0:
                j+=4;
        }
        System.out.println(j);//there is no break it calculate all numbers 2+4


        }
        }



