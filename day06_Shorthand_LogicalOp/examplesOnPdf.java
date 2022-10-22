package day06_Shorthand_LogicalOp;

public class examplesOnPdf {

    public static void main(String[] args) {

        int firstNumber =5;
        int secondNumber=3;

        if(firstNumber > secondNumber){

            System.out.println("First number " +firstNumber + " is greater than Second number");

        }

        int ApplesCount=20;
        int OrangesCount=30;
        int PearsCount=30;

        boolean comp = ApplesCount<OrangesCount||OrangesCount>=PearsCount;
        System.out.println(comp);


        String OutsideWeather;
        int Degree;
        OutsideWeather="Rainy";
        Degree=70;
        boolean comp2=(!(OutsideWeather=="Rainy"||Degree==70));
        System.out.println(comp2);
        /*

        boolean com1 =  (!(outsideweather == "Rainy" || degree ==70));
                        //             true         ||     true
                        //      ! (true) ==> false
        System.out.println(com1); // result is: false because of !

         */

        int b=2;
        boolean res=++b==2||--b==2&&--b==2;
        System.out.println(res);
        /*
        int b = 2; //1
        boolean res = ++b == 2   ||   --b == 2 && --b == 2;
                    // 3  == 2   ||    2  == 2 &&  1  == 2;
                    //   false   ||     true  &&     false
                    //   false   ||          false
                    //    false  OR false ==> false
        System.out.println(res);
    }
}
         */

        boolean x=true, z=true;
        int y=20;
        x=(y!=10)||(z=false);
        System.out.println(x);

        /*
         boolean x = true;
       boolean z = true;
       int y = 20;
             x = (y != 10) || (z = false);
        //true = ( true )  || (  false );
        //true =        true   ==> true
        System.out.println(x); // result is: true
         */

        double s =20;
        double p =80;


        if(((s+p)*25+(s+p))%4 == 20 || ((s+p)*25+(s+p))%4<20)
        {
            System.out.println("true");}

        int voterAge =18;



        if(voterAge>18||voterAge==18)
        {
            System.out.println("You are eligible to vote");}

        if(voterAge<18){
            System.out.println("You are not eligible to vote");}

        int n1=4;
        int n2=8;
        int n3=1;

        if(n2>n1&&n2>n3){
            System.out.println("The greatest number is "+n2);}
        if(n1>n2&&n1>n3){
            System.out.println("The greatest number is"+ n1);}
        if(n3>n1&&n3>n2){
            System.out.println("The greatest number is"+n3);}

        int number1=9;
        int number2=5;
        if(number1==number2){
            System.out.println(number1+" is equal to "+number2);}
        if(number1!=number2){
            System.out.println(number1+" is not equal to "+number2);}

        int hour=12;

        if(hour<12){
            System.out.println("Good morning");}
        if(hour>=12 && hour<15){
            System.out.println("Good afternoon");}
        if(hour>=15){
            System.out.println("Good evening");}

        int numberOfWaterMelon;
        boolean lotsOfWaterMelon;
        lotsOfWaterMelon=false;
        numberOfWaterMelon=40;

        if(numberOfWaterMelon>=20){
            System.out.println("I have more than 20 watermelon");lotsOfWaterMelon=true;}
        if(lotsOfWaterMelon){
            System.out.println("Good Job");}
        if(lotsOfWaterMelon==false){
            System.out.println("I need more watermelon");}
    }
}
