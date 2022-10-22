package MixedEveryting;

public class UpperCase {

    public String endUp(String str) {

        if (str.length()<=3){
            return str.toUpperCase();
        }else {
            return str.substring(str.length()-3).toUpperCase();
        }

    }

}
