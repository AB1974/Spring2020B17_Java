package day00_StudyAtHome;

import jdk.nashorn.internal.runtime.events.RecompilationEvent;

public class JavaRecapAfterLoop {
    public static void main(String[] args) {


int sum=0;

for(int i=1 ;i<=1000 ;i++){

    sum+=i;

}
        System.out.println("The sum of all numbers  is : "+sum);


int sum1=0;

for(int i=2 ;i<=1000;i+=2){

    sum1+=i;
}
        System.out.println("The sum of even numbers  is : "+sum1);

int sum4=0;
for(int i=2;i<=1000;i++){

    if(i%2==0){
        sum4+=i;
    }
}
        System.out.println("The sum of even numbers  is : "+sum4);
int sum2=0;
for(int i =1;i<=1000 ;i+=2){
    sum2+=i;

}
        System.out.println("The sum of odd numbers  is : "+sum2);


int sum3=0;

for (int i=1;i<=1000 ;i++){
    if(i%2!=0){

        sum3+=i;
    }

}
        System.out.println("The sum of all numbers  is : "+sum3);
}

}