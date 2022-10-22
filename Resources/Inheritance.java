package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {
            //sub               //super

    public static void main(String[] args) {
        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
      //  System.out.println(Inheritance.defaultData);//because they are in another package
     //   System.out.println(Inheritance.privateData);//because they are in another package
    }

}
