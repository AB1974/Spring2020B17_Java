package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        //ternary:? means if ,  : means else///
        String result = "";
        if(9>10){
            result = "9 is greater";}
        else{
            result ="10 is greater";}

        String result2=(9>10)? "9 is greater" : "10 is greater";
        System.out.println(result);
        System.out.println(result2);
        System.out.println("===========================================");

        int age =21;

        boolean eligibility =(age>=21)? true: false;

        System.out.println(eligibility);

        /*if(age>=21){
            eligibility=true;
        }else{
            eligibility=false;
        }
        */
        System.out.println("=========================================");
        int ageOfPerson =20;
        String eligibleToVote= "";
        if(ageOfPerson>=18){
            eligibleToVote = "yes";}
        else{eligibleToVote ="no";
        }
        //TERNARY DOWN BELOW
        String eligibleVote2= ageOfPerson>=18 ? "yes" : "no";

        System.out.println(eligibleToVote);
        System.out.println(eligibleVote2);
        }

    }


