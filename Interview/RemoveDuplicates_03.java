package Interview;

public class RemoveDuplicates_03 {

    public static void main(String[] args) {
        String str = "AABBCCDD";
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(""+str.charAt(i))){//str.substring(i,i+1)
                nonDup += ""+str.charAt(i);//
            }
        }
        System.out.println(nonDup);

    }

}



