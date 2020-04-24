package day00_StudyAtHome;

public class Loop {


    // print numbers btw 0~100 divisible by 3 or 5

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0){//if there is only 1 statement you do not need{}
                System.out.println(i);}
        }

        System.out.println("=======================");

        //Reverse your name .

        String name = "Anna";
                 //    0123
        String result = "";
        int lastIndex = name.length() - 1;

        for (int i = lastIndex; i >= 0; i--) {

            //result += name.charAt(i);
           result+=name.substring(i,i+1);//(3,4) it will not take ending index ! It will take only 3 (a)

        }

        System.out.println(result);
        if (name.equalsIgnoreCase(result)) {
            System.out.println("name is palindrome");
        } else {
            System.out.println("is not a palindrome name");
        }
    }
}
