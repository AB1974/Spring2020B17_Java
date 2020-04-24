package day12_JavaRecap;

public class SwitchStatements {

    public static void main(String[] args) {

        switch(3){

            default:
                System.out.println("Invalid Case");
                break;

            case 1:
                System.out.println("Case 1");
                break;    // exits switch statement

            case 2:
                System.out.println("Case 2");
                break;
        }

        System.out.println("===================================================");

        /*
        200, OK
        201, Created
        202, Accepted
         */

        int statusCode =800;
        String result = "";
        switch(statusCode){

            case 200:
                //  System.out.println("Ok");
                result = "Ok";
                break;

            case 201:
                //   System.out.println("Created");
                result = "Created";
                break;

            case 202:
                //   System.out.println("Accepted");
                result = "Accepted";
                break;

            default:
                //  System.out.println("Invalid Status Code");
                result = "Invalid Status Code";
        }

        System.out.println(result);

    }
}