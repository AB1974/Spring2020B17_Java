package day08_IfStatements;

public class MultiBranchIfStatements {
    public static void main(String[] args) {

        double  score = 89.5;

        boolean gradeA = 100>=score && score>=90;
        boolean gradeB = 90>score && score>=80;
        boolean gradeC = 80>score && score>=70;
        boolean gradeD = 70>score && score>=60;

        char grade = ' ';// local variable or you can use String grade = " " ;Because we want to report as A,B,C,D,E
        //local variable we need to initilize them first
        //String grade = "A" ;

        if (gradeA){ grade='A';}

        else if(gradeB){grade = 'B';}
        else if(gradeC){grade ='C';}
        else if(gradeD){grade ='D';}
        else{ grade ='F';}

        System.out.println("Score " +score + " is: "+grade);



    }
}
