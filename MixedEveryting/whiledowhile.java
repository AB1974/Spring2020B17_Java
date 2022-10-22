package MixedEveryting;

public class whiledowhile {

    public static void main(String[] args) {


        int apples = 1;

        while (apples <= 10) {
            System.out.println("I'm eating an apple " + apples);
            apples++;
        }
        System.out.println("no more apples");

        int bananas = 11;
        do {
            System.out.println("I'm eating an banana " + bananas);
            bananas++;
        } while (bananas <= 10);

        System.out.println("no more bananas");

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {


            System.out.println(array[i]);


        }
        String[] str = {"Aylin", "Engin", "Arin"};
        for (String each : str) {
            System.out.println(each);
        }


    }


}


