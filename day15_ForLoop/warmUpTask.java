package day15_ForLoop;

import java.util.Scanner;

public class warmUpTask {
    public static void main(String[] args) {
       /*
	1. write a program that asks user's first and last name, then prints out the initials of the user
					cybertek
					batch12
				output:your initial is: CB
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first and last name");

        String firstName = scan.next();
        String lastName = scan.next();

        String result = firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase();
        System.out.println(result);

        /*
		2.	username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"
     */
        System.out.println("Please enter your username: ");
        String username = scan.next();
        System.out.println("Please enter your password: ");
        String password = scan.next();
        if (username.endsWith("@gmail.com")) {
            if (username.equalsIgnoreCase("cybertek.batch17@gmail.com")
                    || password.equals("JavaBeauties")) {
                System.out.println("Loged in successfully!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("It is not a valid email!");
        }
/*
              3.  write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
 */
        String str = "Java";
                    //0123
        //One solution:
        String reverse1 = "" +str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse1);

        //Another solution:
        String reverse2 = str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
        System.out.println(reverse2);



    }

}
