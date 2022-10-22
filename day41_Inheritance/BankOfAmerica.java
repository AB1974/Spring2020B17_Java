package day41_Inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount Irina = new BankAccount("Aylin", "Bekem");

        System.out.println(Irina.getAccountHolder());
        System.out.println(Irina.getBalance());
        Irina.checkBalance();//0.0
        Irina.depositing(120);
        Irina.checkBalance();//120
        Irina.withdrawing(80);
        Irina.checkBalance();//40
        System.out.println(Irina);
        Irina.withdrawing(100);//there is a bug it should not be negative
        System.out.println(Irina);
        Irina.depositing(200000);
        System.out.println(Irina);




    }
}
