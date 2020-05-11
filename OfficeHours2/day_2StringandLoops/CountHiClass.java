package OfficeHours2.day_2StringandLoops;

public class CountHiClass {

    public static void main(String[] args) {

        String str = "java cs java pro";
        String str3 = "hi abc hi";
        System.out.println(str.replace("java", "c#"));
        System.out.println(str.replaceFirst("java", "c#"));

        int count = 0;
        for(int i =0; i<str3.length();i++){
            if(str3.contains("hi")){
                count++;
                str3 = str3.replaceFirst("hi","");
            }
        }
        System.out.println(count);
    }
    }



