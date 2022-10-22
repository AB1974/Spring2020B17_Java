package OfficeHours.day_1StringandLoops;

public class MakeOutWordClass {

    public String makeOutWord(String out, String word) {

        String front = out.substring(0, 2);
        String back = out.substring(2);

        return front + word + back;
    }

}

