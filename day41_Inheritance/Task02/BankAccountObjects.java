package day41_Inheritance.Task02;

public class BankAccountObjects {

    public static void main(String[] args) {
        CheckingAccount obj1 = new CheckingAccount();
        obj1.accountHolder = "Saban";
        obj1.showBalance();

        obj1.deposit(25000);
        obj1.showBalance();
        obj1.withdraw(10000);
        obj1.showBalance();//15000
        System.out.println(obj1);

        SavingAccount obj2 = new SavingAccount();
        System.out.println(SavingAccount.interestRate);
        obj2.accountHolder = "Aylin";
        obj2.deposit(30000);
        obj2.showBalance();
        System.out.println(obj2);
    }


}
