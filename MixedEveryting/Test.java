package MixedEveryting;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException{//it has to be IO or parent class (Exception)
        method();
        System.out.println("completed");

    }

    public static void method() throws IOException {

        throw new IOException();//manual exception yaratiyorsun
    }
}
