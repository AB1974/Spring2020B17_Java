package day50_polymorphism.OOPReview;

public class Encapsulation {

    private String username = "MIT";//we can not access this data outside of the class

    public String getUsername() {//read only
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


class Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();//we need to create object to call instance variable
        //    obj.username; because private !
        System.out.println(obj.getUsername());
        obj.setUsername("Cybertek");//we change the
        System.out.println(obj.getUsername());//read the data

        // you can not generate setter if the variable final !
    }
}