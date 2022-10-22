package OfficeHours.day_4_Strings_and_Loops;

public class XBalanceClass {
    public boolean xyBalance(String str) {

        for(int i=0; i < str.length(); i++) {

            if(str.charAt(i) == 'x'){
                if(!str.substring(i).contains("y")) return false;
            }

        }

        return true;
    }

}
