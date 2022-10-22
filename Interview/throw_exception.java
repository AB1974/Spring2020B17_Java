package Interview;

import java.util.NoSuchElementException;

public class throw_exception {

    public static void main(String[] args) {


        try {
            throw new NoSuchElementException();
        } catch (Exception e) {
            System.out.println("Error");
        }


    }
}



