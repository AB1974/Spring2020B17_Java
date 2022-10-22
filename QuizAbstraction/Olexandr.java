package QuizAbstraction;

interface Fatih {

    void readBook();

    abstract void watchTV();
}

abstract class Omer implements Fatih {

    public void readBook() {

        System.out.println("omer is reading");
    }
}

public class Olexandr extends Omer {

        public void watchTV(){
            System.out.println("Olexandr is watching TV");

        }
    }


