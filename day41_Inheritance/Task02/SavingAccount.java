package day41_Inheritance.Task02;

/**
 * create sub class of BankAccount and name it SavingAccount
 * 			variables: accountNumber, accountHolder, balance, interestRate
 * 			methods: deposit, showBalance
 */
public class SavingAccount extends BankAccount {
    /**
     * accountNumber inherited
     * accountHolder inherited
     * balance inherited
     * deposit() inherited
     * showbalance() inherited
     * toString()inherited
     * interestRate()--we will declare
     */

    public static double interestRate;

    static{
        interestRate=0.02;
    }
}
