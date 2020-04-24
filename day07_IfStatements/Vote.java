package day07_IfStatements;

public class Vote {

    /*

    5. write a java program that can identify if a person is eligible to vote for Donald Trump
     */
    public static void main(String[] args) {

      int age =18 ;
      boolean UScitizen =true;


      boolean eligible = age >=18 && UScitizen ==true;

      if(eligible){

          System.out.println("You are eligible to vote");}

      if(!eligible ){
          System.out.println("You are not eligible to vote");

      }


    }
}
