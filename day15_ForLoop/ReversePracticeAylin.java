package day15_ForLoop;

public class ReversePracticeAylin {
    public static void main(String[] args) {

        String str = "Aylin";
        String wordReverse = "";

        for (int i = 4; i >= 0; i--) {

            wordReverse += str.charAt(i);
        }
        System.out.println(wordReverse);

        for (int i = 0 ;i <50 ; i++){

            if(i%2!=0){
                System.out.println(i);
            }
        }


    }

}


