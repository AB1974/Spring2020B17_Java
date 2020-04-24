package day26_MethodOverloading;
import java.util.*;
public class Replit_115 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] words = new String[5];
            for (int i = 0; i < 5; i++) {

                words[i] = input.nextLine();

            }
            String largest=words[0];
for (int j=0;j<words.length;j++){

    for(int i=0;i<words.length;i++){
        if(words[i].length()>words[j].length()){
            largest=words[i];
        }



    }


}



            System.out.println(largest);




        }
}