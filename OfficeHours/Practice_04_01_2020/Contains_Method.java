package OfficeHours.Practice_04_01_2020;

public class Contains_Method {

    public static void main(String[] args) {

        //contains (str) checks if the str is includes or not returns boolean( true or false)

        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("Java"));//true

        String sentence2 = "Top 3 Viruses are : 1.Corona, 2.Henta, 3.Ebola";
        System.out.println(sentence2.contains("Corona"));
        System.out.println(sentence2.contains("Java"));



    }
}
