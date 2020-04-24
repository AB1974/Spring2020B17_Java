package OfficeHours.Practice_03_25_2020;

public class nested_if {


    public static void main(String[] args) {

        int salary =50000;
        int creditscore=725;
        byte jobHistory=2;


        if(salary>50000){

            if(creditscore>700){

                if(jobHistory>=2){

                    System.out.println("You are eligible due to your job history ");

                }else{

                    System.out.println("You are not eligible due to your  job history");
                }



            }else{
                System.out.println("You are not eligible due to your credit score");}




        }else{

            System.out.println("you are not eligible to loan ");
        }

    }
}


