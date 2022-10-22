package OfficeHours.day_4_Strings_and_Loops;

public class XYZMIddleClass {
    public static void main(String[] args) {
        String s = "java is java is java";

        System.out.println(s.indexOf("java", s.length()/2 - 4));

    }

    public boolean xyzMiddle(String str) {

        if(str.length() < 3) return false;

        int mid = str.indexOf("xyz", str.length()/2 - 3);

        int before = str.substring(0,mid).length();
        int after = str.substring(mid + 3).length();

        return before == after || before + 1 == after || before == after + 1;

    }
}
