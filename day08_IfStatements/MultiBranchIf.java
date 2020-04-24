package day08_IfStatements;

import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {

        int a =100;

        boolean zero = a==0;
        boolean negative =a<0;
        boolean positive =a>0;

        if(zero){
            System.out.println("zero");}
        if(negative){
            System.out.println("negative");}
        if(positive){
            System.out.println("positive");}

//MULTI BRANCH IF STATEMENT IS DOWN

        if(a==0){
            System.out.println("zero");}
        else if(a>0){
            System.out.println("positive");}
        else{
            System.out.println("negative");}

        int num=10;
        int num2=num++;

        System.out.println("num: "+num);
        System.out.println("num2: "+num2);


    }
}
