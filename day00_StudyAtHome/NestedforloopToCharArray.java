package day00_StudyAtHome;

public class NestedforloopToCharArray {

    public static void main(String[] args) {

        String words = "huehuehuehue";

        char ch2[] = words.toCharArray();

        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        for (int i=0;i<ch2.length;i++){

            for(int j=0;j<ch.length;j++){
                if(ch2[i]==ch[j]){
                    System.out.print(ch2[i]);
                }
            }
        }
        System.out.println();



        String words3 = "huehuehuehue";

        char[] ch4 = words3.toCharArray();
        char[] ch3 = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < ch4.length; i++) {


            for (int j = 0; j < ch3.length; j++) {

                if (ch4[i]==ch3[j]) {


                    System.out.print(ch4[i]);
                }

            }
    }

}}

