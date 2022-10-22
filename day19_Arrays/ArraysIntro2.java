package day19_Arrays;

public class ArraysIntro2 {
    public static void main(String[] args) {


        String Names[] = {"Ozlem", "Hulya", "Arin", "Engin"};
                            //  0       1       2       3

        String str = Names[2];

        System.out.println(str);

        System.out.println("======================================");

        String family[] = {"Faruk", "Leyla", "Fatos", "Mehmet"};
                //             0       1       2       3

        String s1 = family[3];


        for (int i = 0; i <= 3; i++) {

            String name1 = family[i];
            System.out.println(name1);

        }
        System.out.println("========================");

        String presidents[]={"George Washington","Abraham Lincoln","JFK","George Bush","Bill Clinton"};
                    //              0                   1            2      3               4

        for (int i=0 ;i<=4;i++) {

            String name3 = presidents[i];
            System.out.println(name3);

        }

        System.out.println("================");

        String emails[]={"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

        //print out all users registered registered with their gmail.

        //max length is 4 in this example.

        for(int i=0 ;i<= 3 ;i++){

            String email = emails[i];

            if (email.endsWith("@gmail.com")) {

                System.out.println(email);
            }

        }












    }
}
