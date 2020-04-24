package day12_JavaRecap;

import java.util.Scanner;
public class Ternaries_Practice {
    /*
    200,OK
    201,CREATED
    202,ACCEPTED
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int statusCode = scan.nextInt();

        String result = "";

        if (statusCode == 200) {
            result = "OK";

        } else if (statusCode == 201) {
            result = "created";
        } else if (statusCode == 202) {
            result = "accepted";
        } else {
            result = "invalid status code";
        }
        System.out.println(result);

        String result2 = (statusCode == 200) ? "OK" : (statusCode == 201) ? "created" : (statusCode == 202) ? "accepted"
                : "invalid status code";

        System.out.println(result2);



    }


}
