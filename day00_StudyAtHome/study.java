package day00_StudyAtHome;
import java.util.Scanner;
public class study {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");

        name=scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String license =scan.next();
        if(license.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipcode=scan.nextInt();

        if(zipcode==20910|| zipcode== 20740){
            premium+=60;

        }else if(zipcode==22102|| zipcode== 22103){
            premium+=30;
        }else{
            premium+=50;
        }System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.next();

        premium+=(vehicleOwnership.equalsIgnoreCase("yes"))?10:20;

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.next();

        if(vehicleUsage.equalsIgnoreCase("business")){
            premium+=50;
        }
        else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium+=10;
        }else if(vehicleUsage.equalsIgnoreCase("Commute")){
            premium+=20;
        }
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool=scan.nextInt();
        premium+=daysDrivenToWorkOrSchool*5;

        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool=scan.nextInt();

        premium+=milesToWorkOrSchool*1;
        System.out.println("How old are you?");
        int age =scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>=16 && age<18){
            premium*=20;
        }else if(age>=18 && age<21){
            premium*=6;
        }else if(age>=21 && age<25){
            premium*=2;

        }
        System.out.println("Enter your experience years");
        int yearsexperience=scan.nextInt();

        if(!(yearsexperience>0 && age-yearsexperience>=16)){
            System.out.println("Invalid data!");
            System.exit(0);

        }else{
            premium-=yearsexperience*5;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident =scan.next();

        if(accident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount=scan.nextInt();

            premium+=(accidentsAmount*0.2)*premium;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        continuousInsurance=scan.next();
        if(continuousInsurance.equalsIgnoreCase("yes")){
            premium*=2;
        }
        scan.nextLine();
        System.out.println("Have you had any accidents in the last 5 years?");
        education=scan.nextLine();
        if(education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase ("Masters")){
            premium*=0.95;
        }else if(education.equalsIgnoreCase("Doctor")){
            premium*=0.90;
        }else if(education.equalsIgnoreCase("Less than High School")){
            premium+=(premium+0.05);
        }
        System.out.println(name+",here is your quote");
        System.out.println("Start Your Policy Today For: $"+premium);
        referenceNumber=name.substring(0,2)+age+name.substring(name.length()-2,name.length())+zipcode+education.replace(" ", "");
        referenceNumber=referenceNumber.toUpperCase();
        System.out.println("Reference number: "+referenceNumber);
    }
}


